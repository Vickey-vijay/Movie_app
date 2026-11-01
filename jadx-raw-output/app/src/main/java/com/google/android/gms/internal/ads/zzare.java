package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzare {
    private static String zzg(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 33);
        sb2.append("Unknown content digest algorthm: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static int zzh(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 33);
        sb2.append("Unknown content digest algorthm: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static X509Certificate[][] zza(String str) throws zzarb, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZza = zzarf.zza(randomAccessFile);
            if (pairZza == null) {
                long length = randomAccessFile.length();
                StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 82);
                sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb2.append(length);
                sb2.append(" bytes");
                throw new zzarb(sb2.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZza.first;
            long jLongValue = ((Long) pairZza.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzarb("ZIP64 APK not supported");
                }
            }
            long jZzb = zzarf.zzb(byteBuffer);
            if (jZzb >= jLongValue) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jZzb).length() + 82 + String.valueOf(jLongValue).length());
                sb3.append("ZIP Central Directory offset out of range: ");
                sb3.append(jZzb);
                sb3.append(". ZIP End of Central Directory offset: ");
                sb3.append(jLongValue);
                throw new zzarb(sb3.toString());
            }
            if (zzarf.zzd(byteBuffer) + jZzb != jLongValue) {
                throw new zzarb("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZzb < 32) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(jZzb).length() + 67);
                sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb4.append(jZzb);
                throw new zzarb(sb4.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jZzb - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzarb("No APK Signing Block before ZIP Central Directory");
            }
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j11).length() + 37);
                sb5.append("APK Signing Block size out of range: ");
                sb5.append(j11);
                throw new zzarb(sb5.toString());
            }
            int i10 = (int) (8 + j11);
            long j12 = jZzb - ((long) i10);
            if (j12 < 0) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j12).length() + 39);
                sb6.append("APK Signing Block offset out of range: ");
                sb6.append(j12);
                throw new zzarb(sb6.toString());
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(j13).length() + 63 + String.valueOf(j11).length());
                sb7.append("APK Signing Block sizes in header and footer do not match: ");
                sb7.append(j13);
                sb7.append(" vs ");
                sb7.append(j11);
                throw new zzarb(sb7.toString());
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            String str2 = "Insufficient data to read size of APK Signing Block entry #";
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                sb8.append("end < start: ");
                sb8.append(iCapacity);
                sb8.append(" < ");
                sb8.append(8);
                throw new IllegalArgumentException(sb8.toString());
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                StringBuilder sb9 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                sb9.append("end > capacity: ");
                sb9.append(iCapacity);
                sb9.append(" > ");
                sb9.append(iCapacity2);
                throw new IllegalArgumentException(sb9.toString());
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i11 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    int i12 = i11 + 1;
                    if (byteBufferSlice.remaining() < 8) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i12).length() + 59);
                        sb10.append(str2);
                        sb10.append(i12);
                        throw new zzarb(sb10.toString());
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        StringBuilder sb11 = new StringBuilder(String.valueOf(i12).length() + 45 + String.valueOf(j14).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i12);
                        sb11.append(" size out of range: ");
                        sb11.append(j14);
                        throw new zzarb(sb11.toString());
                    }
                    int i13 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i13;
                    if (i13 > byteBufferSlice.remaining()) {
                        int iRemaining = byteBufferSlice.remaining();
                        StringBuilder sb12 = new StringBuilder(String.valueOf(i12).length() + 45 + String.valueOf(i13).length() + 13 + String.valueOf(iRemaining).length());
                        sb12.append("APK Signing Block entry #");
                        sb12.append(i12);
                        sb12.append(" size out of range: ");
                        sb12.append(i13);
                        sb12.append(", available: ");
                        sb12.append(iRemaining);
                        throw new zzarb(sb12.toString());
                    }
                    String str3 = str2;
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrZzb = zzb(randomAccessFile.getChannel(), new zzara(zzi(byteBufferSlice, i13 - 4), jLongValue2, jZzb, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrZzb;
                    }
                    byteBufferSlice.position(iPosition2);
                    i11 = i12;
                    str2 = str3;
                }
                throw new zzarb("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th3;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzara zzaraVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferZzj = zzj(zzaraVar.zza());
                int i10 = 0;
                while (byteBufferZzj.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzc(zzj(byteBufferZzj), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                        sb2.append("Failed to parse/verify signer #");
                        sb2.append(i10);
                        sb2.append(" block");
                        throw new SecurityException(sb2.toString(), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(map, fileChannel, zzaraVar.zzb(), zzaraVar.zzc(), zzaraVar.zzd(), zzaraVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    private static byte[][] zze(int[] iArr, zzaqy[] zzaqyVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c10;
        int i11;
        long j11 = 0;
        long jZza = 0;
        int i12 = 0;
        while (true) {
            j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i10 = 3;
            if (i12 >= 3) {
                break;
            }
            jZza += (zzaqyVarArr[i12].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i12++;
        }
        if (jZza >= 2097151) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jZza).length() + 17);
            sb2.append("Too many chunks: ");
            sb2.append(jZza);
            throw new DigestException(sb2.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i11 = 1;
            if (i13 >= length) {
                break;
            }
            int i14 = (int) jZza;
            byte[] bArr2 = new byte[(zzh(iArr[i13]) * i14) + 5];
            bArr2[0] = 90;
            zzl(i14, bArr2, 1);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            String strZzg = zzg(iArr[i15]);
            try {
                messageDigestArr[i15] = MessageDigest.getInstance(strZzg);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strZzg.concat(" digest not supported"), e10);
            }
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i10) {
            zzaqy zzaqyVar = zzaqyVarArr[i16];
            long j12 = j11;
            int i19 = i16;
            long jZza2 = zzaqyVar.zza();
            while (jZza2 > j11) {
                int iMin = (int) Math.min(jZza2, j10);
                zzl(iMin, bArr3, i11);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                long j13 = j12;
                try {
                    zzaqyVar.zzb(messageDigestArr, j13, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iZzh = zzh(i22);
                        zzaqy zzaqyVar2 = zzaqyVar;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        byte[] bArr5 = bArr3;
                        int iDigest = messageDigest.digest(bArr4, (i17 * iZzh) + 5, iZzh);
                        if (iDigest != iZzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb3.append("Unexpected output size of ");
                            sb3.append(algorithm);
                            sb3.append(" digest: ");
                            sb3.append(iDigest);
                            throw new RuntimeException(sb3.toString());
                        }
                        i21++;
                        c10 = 5;
                        zzaqyVar = zzaqyVar2;
                        bArr3 = bArr5;
                    }
                    long j14 = iMin;
                    long j15 = j13 + j14;
                    jZza2 -= j14;
                    i17++;
                    j11 = 0;
                    i11 = 1;
                    j12 = j15;
                    j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                } catch (IOException e11) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i17).length() + 37 + String.valueOf(i18).length());
                    sb4.append("Failed to digest chunk #");
                    sb4.append(i17);
                    sb4.append(" of section #");
                    sb4.append(i18);
                    throw new DigestException(sb4.toString(), e11);
                }
            }
            i18++;
            i16 = i19 + 1;
            j11 = 0;
            j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i10 = 3;
            i11 = 1;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr7 = bArr[i23];
            String strZzg2 = zzg(i24);
            try {
                bArr6[i23] = MessageDigest.getInstance(strZzg2).digest(bArr7);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strZzg2.concat(" digest not supported"), e12);
            }
        }
        return bArr6;
    }

    private static int zzf(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static void zzl(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzj = zzj(byteBuffer);
        ByteBuffer byteBufferZzj2 = zzj(byteBuffer);
        byte[] bArrZzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzk2 = null;
        int i10 = -1;
        byte[] bArrZzk3 = null;
        int i11 = 0;
        while (byteBufferZzj2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferZzj3 = zzj(byteBufferZzj2);
                if (byteBufferZzj3.remaining() >= 8) {
                    int i12 = byteBufferZzj3.getInt();
                    arrayList.add(Integer.valueOf(i12));
                    if (i12 != 513 && i12 != 514 && i12 != 769) {
                        switch (i12) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i10 != -1) {
                        int iZzf = zzf(i12);
                        int iZzf2 = zzf(i10);
                        if (iZzf != 1 && iZzf2 == 1) {
                        }
                    }
                    bArrZzk3 = zzk(byteBufferZzj3);
                    i10 = i12;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e10) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 34);
                sb2.append("Failed to parse signature record #");
                sb2.append(i11);
                throw new SecurityException(sb2.toString(), e10);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 != 513 && i10 != 514) {
            if (i10 != 769) {
                switch (i10) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
                }
            } else {
                str = "DSA";
            }
        } else {
            str = "EC";
        }
        if (i10 != 513) {
            if (i10 != 514) {
                if (i10 != 769) {
                    switch (i10) {
                        case 257:
                            pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            break;
                        case 258:
                            pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            break;
                        case 259:
                            pairCreate = Pair.create("SHA256withRSA", null);
                            break;
                        case 260:
                            pairCreate = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
                    }
                } else {
                    pairCreate = Pair.create("SHA256withDSA", null);
                }
            } else {
                pairCreate = Pair.create("SHA512withECDSA", null);
            }
        } else {
            pairCreate = Pair.create("SHA256withECDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzj);
            if (signature.verify(bArrZzk3)) {
                byteBufferZzj.clear();
                ByteBuffer byteBufferZzj4 = zzj(byteBufferZzj);
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (byteBufferZzj4.hasRemaining()) {
                    i13++;
                    try {
                        ByteBuffer byteBufferZzj5 = zzj(byteBufferZzj4);
                        if (byteBufferZzj5.remaining() >= 8) {
                            int i14 = byteBufferZzj5.getInt();
                            arrayList2.add(Integer.valueOf(i14));
                            if (i14 == i10) {
                                bArrZzk2 = zzk(byteBufferZzj5);
                            }
                        } else {
                            throw new IOException("Record too short");
                        }
                    } catch (IOException | BufferUnderflowException e11) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 31);
                        sb3.append("Failed to parse digest record #");
                        sb3.append(i13);
                        throw new IOException(sb3.toString(), e11);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int iZzf3 = zzf(i10);
                    byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzf3), bArrZzk2);
                    if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzk2)) {
                        throw new SecurityException(zzg(iZzf3).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer byteBufferZzj6 = zzj(byteBufferZzj);
                    ArrayList arrayList3 = new ArrayList();
                    int i15 = 0;
                    while (byteBufferZzj6.hasRemaining()) {
                        i15++;
                        byte[] bArrZzk4 = zzk(byteBufferZzj6);
                        try {
                            arrayList3.add(new zzarc((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzk4)), bArrZzk4));
                        } catch (CertificateException e12) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i15).length() + 30);
                            sb4.append("Failed to decode certificate #");
                            sb4.append(i15);
                            throw new SecurityException(sb4.toString(), e12);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (Arrays.equals(bArrZzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException("No certificates listed");
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e13) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5.append("Failed to verify ");
            sb5.append(str2);
            sb5.append(" signature");
            throw new SecurityException(sb5.toString(), e13);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaqz zzaqzVar = new zzaqz(fileChannel, 0L, j10);
            zzaqz zzaqzVar2 = new zzaqz(fileChannel, j11, j12 - j11);
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzarf.zzc(byteBufferDuplicate, j10);
            zzaqx zzaqxVar = new zzaqx(byteBufferDuplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator it = map.keySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = ((Integer) it.next()).intValue();
                i10++;
            }
            try {
                byte[][] bArrZze = zze(iArr, new zzaqy[]{zzaqzVar, zzaqzVar2, zzaqxVar});
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = iArr[i11];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrZze[i11])) {
                        throw new SecurityException(zzg(i12).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e10) {
                throw new SecurityException("Failed to compute digest(s) of contents", e10);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 >= iPosition && i11 <= iLimit) {
            byteBuffer.limit(i11);
            try {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.order(byteBuffer.order());
                byteBuffer.position(i11);
                return byteBufferSlice;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return zzi(byteBuffer, i10);
                }
                int iRemaining = byteBuffer.remaining();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 79 + String.valueOf(iRemaining).length());
                sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb2.append(i10);
                sb2.append(", remaining: ");
                sb2.append(iRemaining);
                throw new IOException(sb2.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        int iRemaining2 = byteBuffer.remaining();
        StringBuilder sb3 = new StringBuilder(String.valueOf(iRemaining2).length() + 82);
        sb3.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        sb3.append(iRemaining2);
        throw new IOException(sb3.toString());
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            int iRemaining = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 68 + String.valueOf(iRemaining).length());
            sb2.append("Underflow while reading length-prefixed value. Length: ");
            sb2.append(i10);
            sb2.append(", available: ");
            sb2.append(iRemaining);
            throw new IOException(sb2.toString());
        }
        throw new IOException("Negative length");
    }
}
