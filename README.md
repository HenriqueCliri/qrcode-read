# 📷 Leitor de QR Code em Java

Este projeto é um **leitor de QR Code** desenvolvido em **Java**, capaz de capturar e interpretar códigos QR a partir de imagens ou da câmera do dispositivo. Ele é ideal para aplicações desktop que necessitam de uma funcionalidade simples e eficiente para leitura de QR Codes.

---

## 🧠 Funcionalidades

- Leitura de QR Code a partir de **imagens locais**
- Leitura em tempo real via **webcam**
- Exibição do conteúdo decodificado (URLs, textos, etc.)
- Interface gráfica simples e objetiva (caso use Java Swing/JavaFX)
- Suporte a múltiplos formatos (QR Code, Data Matrix, etc.) *(dependendo da biblioteca)*

---

## 🚀 Tecnologias Utilizadas

- **Java 8+**
- **ZXing** (Zebra Crossing) – biblioteca para leitura de códigos de barras e QR Code
- (opcional) **Java Swing / JavaFX** – para interface gráfica
- (opcional) **OpenCV** – para captura via webcam (caso não use ZXing + webcam diretamente)

---

## ✅ Pré-requisitos

Antes de executar o projeto, você precisará de:

- [JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/) ou outro gerenciador de dependências (caso o projeto use)
- Webcam (para leitura em tempo real)

---

## 🔧 Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/leitor-qr-java.git
   cd leitor-qr-java
