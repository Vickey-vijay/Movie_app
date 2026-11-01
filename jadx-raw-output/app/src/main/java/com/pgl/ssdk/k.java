package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class k {
    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @DungeonFlag
    public static List<e> a(File file) throws Throwable {
        CertificateFactory certificateFactory;
        FileInputStream fileInputStream;
        IOException e10;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2 = null;
        try {
            certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException e11) {
            e11.printStackTrace();
            certificateFactory = null;
        }
        if (certificateFactory == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    zipInputStream = new ZipInputStream(fileInputStream);
                    while (true) {
                        try {
                            try {
                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                if (nextEntry != null) {
                                    String name = nextEntry.getName();
                                    if (name.startsWith("META-INF/")) {
                                        if (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC")) {
                                            try {
                                                for (Certificate certificate : certificateFactory.generateCertificates(new ByteArrayInputStream(a(zipInputStream)))) {
                                                    if (certificate instanceof X509Certificate) {
                                                        arrayList.add(new e(String.valueOf(((X509Certificate) certificate).getSubjectDN()), certificate.getEncoded()));
                                                    }
                                                }
                                            } catch (CertificateException e12) {
                                                e12.printStackTrace();
                                            }
                                        } else {
                                            zipInputStream.closeEntry();
                                        }
                                    }
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                    }
                                }
                            } catch (IOException e14) {
                                e10 = e14;
                                e10.printStackTrace();
                                if (zipInputStream != null) {
                                    try {
                                        zipInputStream.close();
                                    } catch (IOException e15) {
                                        e15.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return arrayList;
                            }
                        } catch (Throwable th2) {
                            zipInputStream2 = zipInputStream;
                            th = th2;
                            if (zipInputStream2 != null) {
                                try {
                                    zipInputStream2.close();
                                } catch (IOException e16) {
                                    e16.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (IOException e17) {
                                e17.printStackTrace();
                                throw th;
                            }
                        }
                    }
                    zipInputStream.close();
                    fileInputStream.close();
                } catch (IOException e18) {
                    e10 = e18;
                    zipInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (zipInputStream2 != null) {
                        zipInputStream2.close();
                    }
                    if (fileInputStream != null) {
                        throw th;
                    }
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e19) {
                e19.printStackTrace();
            }
        } catch (IOException e20) {
            fileInputStream = null;
            e10 = e20;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return arrayList;
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
