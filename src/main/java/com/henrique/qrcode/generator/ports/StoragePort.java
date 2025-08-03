package com.henrique.qrcode.generator.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String uuid, String filename, String contentType);
}
