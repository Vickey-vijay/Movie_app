package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanc {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzani zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzanc zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private final void zzk(long j10, boolean z10, String str, Map map) {
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z10) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcw) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < zzf(); i10++) {
                zze(i10).zzk(j10, z10 || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcw) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private final void zzm(long j10, Map map, Map map2, String str, Map map3) {
        zzanc zzancVar;
        zzani zzaniVarZza;
        boolean z10;
        int i10;
        if (zzc(j10)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.zzk;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcw zzcwVar = (zzcw) map3.get(str4);
                    zzcwVar.getClass();
                    zzang zzangVar = (zzang) map2.get(str3);
                    zzangVar.getClass();
                    int i11 = zzangVar.zzj;
                    zzani zzaniVarZza2 = zzanh.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcwVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcwVar.zza(spannableStringBuilder);
                    }
                    if (zzaniVarZza2 != null) {
                        zzanc zzancVar2 = this.zzi;
                        if (zzaniVarZza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzaniVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzl()) {
                            zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaniVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzo()) {
                            zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaniVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzh() != null) {
                            zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaniVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzE() != null) {
                            zzanb zzanbVarZzE = zzaniVarZza2.zzE();
                            zzanbVarZzE.getClass();
                            int i12 = zzanbVarZzE.zza;
                            if (i12 == -1) {
                                i12 = (i11 == 2 || i11 == 1) ? 3 : 1;
                                i10 = 1;
                            } else {
                                i10 = zzanbVarZzE.zzb;
                            }
                            int i13 = zzanbVarZzE.zzc;
                            if (i13 == -2) {
                                i13 = 1;
                            }
                            zzdd.zza(spannableStringBuilder, new zzde(i12, i10, i13), iIntValue, iIntValue2, 33);
                        }
                        int iZzv = zzaniVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzancVar2 == null) {
                                    zzancVar2 = null;
                                    break;
                                }
                                zzani zzaniVarZza3 = zzanh.zza(zzancVar2.zzf, zzancVar2.zzj, map);
                                if (zzaniVarZza3 != null && zzaniVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzancVar2 = zzancVar2.zzi;
                                }
                            }
                            if (zzancVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzancVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzancVar = null;
                                        break;
                                    }
                                    zzanc zzancVar3 = (zzanc) arrayDeque.pop();
                                    zzani zzaniVarZza4 = zzanh.zza(zzancVar3.zzf, zzancVar3.zzj, map);
                                    if (zzaniVarZza4 != null && zzaniVarZza4.zzv() == 3) {
                                        zzancVar = zzancVar3;
                                        break;
                                    }
                                    for (int iZzf = zzancVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzancVar3.zze(iZzf));
                                    }
                                }
                                if (zzancVar != null) {
                                    if (zzancVar.zzf() != 1 || zzancVar.zze(0).zzb == null) {
                                        zzee.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzancVar.zze(0).zzb;
                                        String str6 = zzfj.zza;
                                        zzani zzaniVarZza5 = zzanh.zza(zzancVar.zzf, zzancVar.zzj, map);
                                        int iZzx = zzaniVarZza5 != null ? zzaniVarZza5.zzx() : -1;
                                        if (iZzx == -1 && (zzaniVarZza = zzanh.zza(zzancVar2.zzf, zzancVar2.zzj, map)) != null) {
                                            iZzx = zzaniVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdc(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzana(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaniVarZza2.zzC()) {
                            zzdd.zza(spannableStringBuilder, new zzdb(), iIntValue, iIntValue2, 33);
                        }
                        int iZzI = zzaniVarZza2.zzI();
                        if (iZzI != 1) {
                            if (iZzI == 2) {
                                zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaniVarZza2.zzJ()), iIntValue, iIntValue2, 33);
                            } else if (iZzI == 3) {
                                zzdd.zzb(spannableStringBuilder, zzaniVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, 33);
                            }
                            z10 = true;
                        } else {
                            z10 = true;
                            zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaniVarZza2.zzJ(), true), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzaniVarZza2.zzq() != Float.MAX_VALUE) {
                                zzcwVar.zzp((zzaniVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzaniVarZza2.zzy() != null) {
                                zzcwVar.zzd(zzaniVarZza2.zzy());
                            }
                            if (zzaniVarZza2.zzA() != null) {
                                zzcwVar.zze(zzaniVarZza2.zzA());
                            }
                        }
                        it = it;
                    }
                }
            }
            for (int i14 = 0; i14 < zzf(); i14++) {
                zze(i14).zzm(j10, map, map2, str3, map3);
            }
        }
    }

    public final boolean zzc(long j10) {
        long j11 = this.zzd;
        if (j11 != -9223372036854775807L) {
            if ((j11 <= j10 || this.zze != -9223372036854775807L) && ((j11 != -9223372036854775807L || j10 >= this.zze) && (j11 > j10 || j10 >= this.zze))) {
                return false;
            }
        } else if (this.zze != -9223372036854775807L) {
            j11 = -9223372036854775807L;
            return j11 <= j10 ? false : false;
        }
        return true;
    }

    public static zzanc zza(String str) {
        return new zzanc(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", Z7.f27998r).replaceAll("[ \t\\x0B\f\r]+", Z7.f27998r), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzanc zzb(@Nullable String str, long j10, long j11, @Nullable zzani zzaniVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzanc zzancVar) {
        return new zzanc(str, null, j10, j11, zzaniVar, strArr, str2, str3, zzancVar);
    }

    private final void zzi(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        if (z10 || zEquals || ("div".equals(str) && this.zzh != null)) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.zze;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzanc zzancVar = (zzanc) this.zzm.get(i10);
                boolean z11 = true;
                if (!z10 && !zEquals) {
                    z11 = false;
                }
                zzancVar.zzi(treeSet, z11);
            }
        }
    }

    private final void zzj(long j10, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean zEquals = "".equals(str3);
        boolean zZzc = zzc(j10);
        if (true != zEquals) {
            str = str3;
        }
        if (zZzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zzf(); i10++) {
            zze(i10).zzj(j10, str, list);
        }
    }

    public final void zzd(zzanc zzancVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzancVar);
    }

    public final zzanc zze(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzanc) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final List zzh(long j10, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j10, false, str, treeMap);
        zzm(j10, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzang zzangVar = (zzang) map2.get(pair.first);
                zzangVar.getClass();
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(bitmapDecodeByteArray);
                zzcwVar.zzi(zzangVar.zzb);
                zzcwVar.zzj(0);
                zzcwVar.zzf(zzangVar.zzc, 0);
                zzcwVar.zzg(zzangVar.zze);
                zzcwVar.zzm(zzangVar.zzf);
                zzcwVar.zzn(zzangVar.zzg);
                zzcwVar.zzo(zzangVar.zzj);
                arrayList2.add(zzcwVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzang zzangVar2 = (zzang) map2.get(entry.getKey());
            zzangVar2.getClass();
            zzcw zzcwVar2 = (zzcw) entry.getValue();
            CharSequence charSequenceZzb = zzcwVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzana zzanaVar : (zzana[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzana.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzanaVar), spannableStringBuilder.getSpanEnd(zzanaVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcwVar2.zzf(zzangVar2.zzc, zzangVar2.zzd);
            zzcwVar2.zzg(zzangVar2.zze);
            zzcwVar2.zzi(zzangVar2.zzb);
            zzcwVar2.zzm(zzangVar2.zzf);
            zzcwVar2.zzl(zzangVar2.zzi, zzangVar2.zzh);
            zzcwVar2.zzo(zzangVar2.zzj);
            arrayList2.add(zzcwVar2.zzr());
        }
        return arrayList2;
    }

    private zzanc(@Nullable String str, @Nullable String str2, long j10, long j11, @Nullable zzani zzaniVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzanc zzancVar) {
        boolean z10;
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaniVar;
        this.zzj = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        this.zzd = j10;
        this.zze = j11;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzancVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcw zzcwVar = new zzcw();
            zzcwVar.zza(new SpannableStringBuilder());
            map.put(str, zzcwVar);
        }
        CharSequence charSequenceZzb = ((zzcw) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }
}
