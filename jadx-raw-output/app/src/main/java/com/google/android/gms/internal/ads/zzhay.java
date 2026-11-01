package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhay implements zzhbl {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhay(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhay zza(String str) {
        return new zzhay(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhyl zzhylVar) throws IOException {
        if (!(zzhylVar instanceof zzhyp)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhylVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhja.zzc(zzhylVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    @Override // com.google.android.gms.internal.ads.zzhbl
    public final zzhql zzb() throws IOException {
        byte b10;
        int i10;
        byte b11;
        zzhqy zzhqyVar;
        byte b12;
        zzhqb zzhqbVar;
        String str = "status";
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i11 = zzhbw.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i12 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i12 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i12);
                    inputStream = inputStream2;
                }
                zzhyn zzhynVarZze = zzhja.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zzhynVarZze.zzc(C3426d4.i.W)) {
                    throw new zzhyo("invalid keyset: no key");
                }
                zzhyl zzhylVarZzh = zzhynVarZze.zzh(C3426d4.i.W);
                if (!(zzhylVarZzh instanceof zzhyk)) {
                    throw new zzhyo("invalid keyset: key must be an array");
                }
                zzhyk zzhykVarZzf = zzhylVarZzh.zzf();
                if (zzhykVarZzf.zzb() == 0) {
                    throw new zzhyo("invalid keyset: key is empty");
                }
                zzhqi zzhqiVarZzh = zzhql.zzh();
                if (zzhynVarZze.zzc("primaryKeyId")) {
                    zzhqiVarZzh.zza(zzc(zzhynVarZze.zzh("primaryKeyId")));
                }
                int i13 = 0;
                while (i13 < zzhykVarZzf.zzb()) {
                    zzhyn zzhynVarZze2 = zzhykVarZzf.zzc(i13).zze();
                    if (!zzhynVarZze2.zzc(str2) || !zzhynVarZze2.zzc(str) || !zzhynVarZze2.zzc("keyId") || !zzhynVarZze2.zzc("outputPrefixType")) {
                        throw new zzhyo("invalid key");
                    }
                    zzhyl zzhylVarZzh2 = zzhynVarZze2.zzh(str2);
                    if (!(zzhylVarZzh2 instanceof zzhyn)) {
                        throw new zzhyo("invalid key: keyData must be an object");
                    }
                    zzhqj zzhqjVarZze = zzhqk.zze();
                    String strZzd = zzhynVarZze2.zzh(str).zzd();
                    String str3 = str;
                    int iHashCode = strZzd.hashCode();
                    String str4 = str2;
                    zzhyk zzhykVar = zzhykVarZzf;
                    if (iHashCode != -891611359) {
                        if (iHashCode != 478389753) {
                            if (iHashCode == 1053567612 && strZzd.equals("DISABLED")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (strZzd.equals("DESTROYED")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strZzd.equals("ENABLED")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        i10 = 3;
                    } else if (b10 == 1) {
                        i10 = 4;
                    } else {
                        if (b10 != 2) {
                            throw new zzhyo("unknown status: ".concat(strZzd));
                        }
                        i10 = 5;
                    }
                    zzhqjVarZze.zze(i10);
                    zzhqjVarZze.zzc(zzc(zzhynVarZze2.zzh("keyId")));
                    String strZzd2 = zzhynVarZze2.zzh("outputPrefixType").zzd();
                    switch (strZzd2) {
                        case "LEGACY":
                            b11 = 2;
                            break;
                        case "RAW":
                            b11 = 1;
                            break;
                        case "TINK":
                            b11 = 0;
                            break;
                        case "CRUNCHY":
                            b11 = 3;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    if (b11 == 0) {
                        zzhqyVar = zzhqy.TINK;
                    } else if (b11 == 1) {
                        zzhqyVar = zzhqy.RAW;
                    } else if (b11 == 2) {
                        zzhqyVar = zzhqy.LEGACY;
                    } else {
                        if (b11 != 3) {
                            throw new zzhyo("unknown output prefix type: ".concat(strZzd2));
                        }
                        zzhqyVar = zzhqy.CRUNCHY;
                    }
                    zzhqjVarZze.zzd(zzhqyVar);
                    zzhyn zzhynVarZze3 = zzhylVarZzh2.zze();
                    if (!zzhynVarZze3.zzc("typeUrl") || !zzhynVarZze3.zzc("value") || !zzhynVarZze3.zzc("keyMaterialType")) {
                        throw new zzhyo("invalid keyData");
                    }
                    byte[] bArrZza = zzhwq.zza(zzhynVarZze3.zzh("value").zzd(), 2);
                    zzhqa zzhqaVarZzd = zzhqc.zzd();
                    zzhqaVarZzd.zza(zzhynVarZze3.zzh("typeUrl").zzd());
                    zzian zzianVar = zzian.zza;
                    zzhqaVarZzd.zzb(zzian.zzs(bArrZza, 0, bArrZza.length));
                    String strZzd3 = zzhynVarZze3.zzh("keyMaterialType").zzd();
                    switch (strZzd3) {
                        case "REMOTE":
                            b12 = 3;
                            break;
                        case "SYMMETRIC":
                            b12 = 0;
                            break;
                        case "ASYMMETRIC_PRIVATE":
                            b12 = 1;
                            break;
                        case "ASYMMETRIC_PUBLIC":
                            b12 = 2;
                            break;
                        default:
                            b12 = -1;
                            break;
                    }
                    if (b12 == 0) {
                        zzhqbVar = zzhqb.SYMMETRIC;
                    } else if (b12 == 1) {
                        zzhqbVar = zzhqb.ASYMMETRIC_PRIVATE;
                    } else if (b12 == 2) {
                        zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
                    } else {
                        if (b12 != 3) {
                            throw new zzhyo("unknown key material type: ".concat(strZzd3));
                        }
                        zzhqbVar = zzhqb.REMOTE;
                    }
                    zzhqaVarZzd.zzc(zzhqbVar);
                    zzhqjVarZze.zza((zzhqc) zzhqaVarZzd.zzbu());
                    zzhqiVarZzh.zzb((zzhqk) zzhqjVarZze.zzbu());
                    i13++;
                    str = str3;
                    str2 = str4;
                    zzhykVarZzf = zzhykVar;
                }
                zzhql zzhqlVar = (zzhql) zzhqiVarZzh.zzbu();
                this.zzb.close();
                return zzhqlVar;
            } catch (Throwable th2) {
                this.zzb.close();
                throw th2;
            }
        } catch (zzhyo | IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
