package com.henrique.qrcode.generator.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.henrique.qrcode.generator.dto.QrCodeGeneratorResponse;
import com.henrique.qrcode.generator.ports.StoragePort;

@Service
public class QrCodeGeneratorService {
    private final StoragePort storage; // significa que QrCodeGeneratorService depende de storage

    public QrCodeGeneratorService(StoragePort storage) {
        this.storage = storage; // atributo

    }

    public QrCodeGeneratorResponse generateAndUploadQrCode(String text) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 200, 200);

        ByteArrayOutputStream pngOutputStrem = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStrem);

        byte[] pngQrCodeData = pngOutputStrem.toByteArray();

        String url = storage.uploadFile(pngQrCodeData, UUID.randomUUID().toString(),"qrcode.png", "image/png");
        
        return new QrCodeGeneratorResponse(url);
    }
}
