package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Ka {
    public static String a(File file) {
        byte[] bArrArray;
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        if (file == null || !file.exists()) {
            bArrArray = null;
        } else {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLockLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) file.length());
                        channel.read(byteBufferAllocate);
                        byteBufferAllocate.flip();
                        bArrArray = byteBufferAllocate.array();
                        file.getAbsolutePath();
                        a(fileLockLock);
                        mo.a((Closeable) randomAccessFile);
                    } catch (IOException | SecurityException unused) {
                        file.getAbsolutePath();
                        a(fileLockLock);
                        mo.a((Closeable) randomAccessFile);
                        bArrArray = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            Rj rj2 = AbstractC4452pj.f57520a;
                            rj2.getClass();
                            rj2.a(new C4477qj("error_during_file_reading", th2));
                            file.getAbsolutePath();
                            a(fileLockLock);
                            mo.a((Closeable) randomAccessFile);
                            bArrArray = null;
                        } catch (Throwable th4) {
                            file.getAbsolutePath();
                            a(fileLockLock);
                            mo.a((Closeable) randomAccessFile);
                            throw th4;
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLockLock = null;
                } catch (Throwable th5) {
                    th2 = th5;
                    fileLockLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th6) {
                th2 = th6;
                randomAccessFile = null;
                fileLockLock = null;
            }
        }
        if (bArrArray == null) {
            return null;
        }
        try {
            return new String(bArrArray, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            String str = new String(bArrArray);
            Rj rj3 = AbstractC4452pj.f57520a;
            rj3.getClass();
            rj3.a(new C4477qj("read_share_file_with_unsupported_encoding", e10));
            return str;
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLockLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLockLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
            byteBufferAllocate.put(bytes);
            byteBufferAllocate.flip();
            channel.write(byteBufferAllocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLockLock);
            mo.a((Closeable) fileOutputStream);
        }
    }
}
