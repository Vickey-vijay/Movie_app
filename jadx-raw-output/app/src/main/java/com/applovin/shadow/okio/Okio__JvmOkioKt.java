package com.applovin.shadow.okio;

import ck.p;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import lk.a0;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("com.applovin.shadow.okio.Okio");

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        p.j(sink, "<this>");
        p.j(mac, "mac");
        return new HashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        p.j(source, "<this>");
        p.j(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final Sink sink(File file) throws FileNotFoundException {
        p.j(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static final Sink sink(OutputStream outputStream) {
        p.j(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(InputStream inputStream) {
        p.j(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        p.j(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        p.j(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        p.j(sink, "<this>");
        p.j(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        p.j(source, "<this>");
        p.j(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
        p.j(sink, "<this>");
        p.j(messageDigest, "digest");
        return new HashingSink(sink, messageDigest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
        p.j(source, "<this>");
        p.j(messageDigest, "digest");
        return new HashingSource(source, messageDigest);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        p.j(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? a0.X(message, "getsockname failed", false, 2, null) : false;
    }

    public static final FileSystem openZip(FileSystem fileSystem, Path path) throws IOException {
        p.j(fileSystem, "<this>");
        p.j(path, "zipPath");
        return ZipFilesKt.openZip$default(path, fileSystem, null, 4, null);
    }

    public static final Sink sink(Socket socket) throws IOException {
        p.j(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        p.i(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Okio.sink(file, z10);
    }

    public static final Source source(Socket socket) throws IOException {
        p.j(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        p.i(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(File file, boolean z10) throws FileNotFoundException {
        p.j(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z10));
    }

    public static final Source source(File file) throws FileNotFoundException {
        p.j(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
        p.j(path, "<this>");
        p.j(openOptionArr, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        p.i(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }

    public static final Source source(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
        p.j(path, "<this>");
        p.j(openOptionArr, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        p.i(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }
}
