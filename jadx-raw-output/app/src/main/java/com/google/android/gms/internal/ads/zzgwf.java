package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwf extends zzgui {
    public static final zzgui zza = new zzgwf(null, new Object[0], 0);
    public final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgwf(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzgui, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.zzd;
            Object[] objArr = this.zzb;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzgty.zza(obj.hashCode());
                    while (true) {
                        int i11 = iZza & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iZza = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzgty.zza(obj.hashCode());
                    while (true) {
                        int i13 = iZza2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iZza2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzgty.zza(obj.hashCode());
                    while (true) {
                        int i14 = iZza3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iZza3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final boolean zzj() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static zzgwf zzk(int i10, Object[] objArr, zzguh zzguhVar) {
        short[] sArr;
        char c10;
        char c11;
        ?? r10;
        ?? r11;
        ?? r12;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzgwf) zza;
        }
        zzgug zzgugVar = null;
        ?? r13 = 0;
        zzgug zzgugVar2 = null;
        zzgug zzgugVar3 = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzgtb.zza(obj, obj2);
            return new zzgwf(null, objArrCopyOf, 1);
        }
        zzgrc.zzn(i11, objArrCopyOf.length >> 1, "index");
        int iZzn = zzgup.zzn(i10);
        if (i11 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzgtb.zza(obj3, obj4);
            i11 = 1;
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = iZzn - 1;
            byte b10 = -1;
            if (iZzn <= 128) {
                byte[] bArr = new byte[iZzn];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj5 = objArrCopyOf[i17];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i17 ^ i12];
                    Objects.requireNonNull(obj6);
                    zzgtb.zza(obj5, obj6);
                    int iZza = zzgty.zza(obj5.hashCode());
                    while (true) {
                        int i18 = iZza & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj5;
                                objArrCopyOf[i16 ^ 1] = obj6;
                            }
                            i15++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj7 = objArrCopyOf[i20 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzgug zzgugVar4 = new zzgug(obj5, obj6, obj7);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj6;
                            zzgugVar2 = zzgugVar4;
                            break;
                        }
                        iZza = i18 + 1;
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    r10 = bArr;
                } else {
                    r12 = new Object[]{bArr, Integer.valueOf(i15), zzgugVar2};
                    c11 = 2;
                }
                c10 = 1;
                r13 = r12;
            } else {
                if (iZzn <= 32768) {
                    sArr = new short[iZzn];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj8 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzgtb.zza(obj8, obj9);
                        int iZza2 = zzgty.zza(obj8.hashCode());
                        while (true) {
                            int i25 = iZza2 & i13;
                            char c12 = (char) sArr[i25];
                            if (c12 == 65535) {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArrCopyOf[i23] = obj8;
                                    objArrCopyOf[i23 ^ 1] = obj9;
                                }
                                i21++;
                                break;
                            }
                            if (obj8.equals(objArrCopyOf[c12])) {
                                int i26 = c12 ^ 1;
                                Object obj10 = objArrCopyOf[i26 == true ? 1 : 0];
                                Objects.requireNonNull(obj10);
                                zzgug zzgugVar5 = new zzgug(obj8, obj9, obj10);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj9;
                                zzgugVar3 = zzgugVar5;
                                break;
                            }
                            iZza2 = i25 + 1;
                        }
                    }
                    if (i21 != i11) {
                        Integer numValueOf = Integer.valueOf(i21);
                        c10 = 1;
                        c11 = 2;
                        r11 = new Object[]{sArr, numValueOf, zzgugVar3};
                        r13 = r11;
                    }
                    r10 = sArr;
                } else {
                    int i27 = 1;
                    sArr = new int[iZzn];
                    Arrays.fill((int[]) sArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj11 = objArrCopyOf[i31];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i31 ^ i27];
                        Objects.requireNonNull(obj12);
                        zzgtb.zza(obj11, obj12);
                        int iZza3 = zzgty.zza(obj11.hashCode());
                        while (true) {
                            int i32 = iZza3 & i13;
                            ?? r15 = sArr[i32];
                            if (r15 == b10) {
                                sArr[i32] = i30;
                                if (i29 < i28) {
                                    objArrCopyOf[i30] = obj11;
                                    objArrCopyOf[i30 ^ 1] = obj12;
                                }
                                i29++;
                                break;
                            }
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i33 = r15 ^ 1;
                                Object obj13 = objArrCopyOf[i33 == true ? 1 : 0];
                                Objects.requireNonNull(obj13);
                                zzgug zzgugVar6 = new zzgug(obj11, obj12, obj13);
                                objArrCopyOf[i33 == true ? 1 : 0] = obj12;
                                zzgugVar = zzgugVar6;
                                break;
                            }
                            iZza3 = i32 + 1;
                            b10 = -1;
                        }
                        i28++;
                        i27 = 1;
                        b10 = -1;
                    }
                    if (i29 != i11) {
                        c10 = 1;
                        c11 = 2;
                        r11 = new Object[]{sArr, Integer.valueOf(i29), zzgugVar};
                        r13 = r11;
                    }
                    r10 = sArr;
                }
                c10 = 1;
                r13 = r12;
            }
            c11 = 2;
            r12 = r10;
            c10 = 1;
            r13 = r12;
        }
        boolean z10 = r13 instanceof Object[];
        ?? r14 = r13;
        if (z10) {
            Object[] objArr2 = (Object[]) r13;
            zzgug zzgugVar7 = (zzgug) objArr2[c11];
            if (zzguhVar == null) {
                throw zzgugVar7.zza();
            }
            zzguhVar.zzc = zzgugVar7;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r14 = obj14;
            i11 = iIntValue;
        }
        return new zzgwf(r14, objArrCopyOf, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgup zze() {
        return new zzgwc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgup zzg() {
        return new zzgwd(this, new zzgwe(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgub zzi() {
        return new zzgwe(this.zzb, 1, this.zzd);
    }
}
