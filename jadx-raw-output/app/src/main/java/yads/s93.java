package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.ViewCompat;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class s93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f82558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v93 f82559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f82560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f82562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s93 f82563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f82564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f82565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f82566m;

    public final s93 a(int i10) {
        ArrayList arrayList = this.f82566m;
        if (arrayList != null) {
            return (s93) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public s93(String str, String str2, long j10, long j11, v93 v93Var, String[] strArr, String str3, String str4, s93 s93Var) {
        boolean z10;
        this.f82554a = str;
        this.f82555b = str2;
        this.f82562i = str4;
        this.f82559f = v93Var;
        this.f82560g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f82556c = z10;
        this.f82557d = j10;
        this.f82558e = j11;
        this.f82561h = (String) ni.a((Object) str3);
        this.f82563j = s93Var;
        this.f82564k = new HashMap();
        this.f82565l = new HashMap();
    }

    public final void a(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f82554a);
        boolean zEquals2 = "div".equals(this.f82554a);
        if (z10 || zEquals || (zEquals2 && this.f82562i != null)) {
            long j10 = this.f82557d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f82558e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f82566m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f82566m.size(); i10++) {
            ((s93) this.f82566m.get(i10)).a(treeSet, z10 || zEquals);
        }
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            n20 n20Var = new n20();
            n20Var.f80513a = new SpannableStringBuilder();
            treeMap.put(str, n20Var);
        }
        CharSequence charSequence = ((n20) treeMap.get(str)).f80513a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean a(long j10) {
        long j11 = this.f82557d;
        return (j11 == -9223372036854775807L && this.f82558e == -9223372036854775807L) || (j11 <= j10 && this.f82558e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f82558e) || (j11 <= j10 && j10 < this.f82558e));
    }

    public final void a(long j10, String str, ArrayList arrayList) {
        if (!"".equals(this.f82561h)) {
            str = this.f82561h;
        }
        if (a(j10) && "div".equals(this.f82554a) && this.f82562i != null) {
            arrayList.add(new Pair(str, this.f82562i));
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f82566m;
            if (i10 >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            a(i10).a(j10, str, arrayList);
            i10++;
        }
    }

    public final void a(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (!a(j10)) {
            return;
        }
        String str2 = "".equals(this.f82561h) ? str : this.f82561h;
        Iterator it = this.f82565l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            int iIntValue = this.f82564k.containsKey(str3) ? ((Integer) this.f82564k.get(str3)).intValue() : 0;
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if (iIntValue != iIntValue2) {
                n20 n20Var = (n20) treeMap.get(str3);
                n20Var.getClass();
                t93 t93Var = (t93) map2.get(str2);
                t93Var.getClass();
                int i10 = t93Var.f82943j;
                v93 v93VarA = u93.a(this.f82559f, this.f82560g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) n20Var.f80513a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    n20Var.f80513a = spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (v93VarA != null) {
                    u93.a(spannableStringBuilder2, iIntValue, iIntValue2, v93VarA, this.f82563j, map, i10);
                    if ("p".equals(this.f82554a)) {
                        float f10 = v93VarA.f83854s;
                        if (f10 != Float.MAX_VALUE) {
                            n20Var.f80529q = (f10 * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = v93VarA.f83850o;
                        if (alignment != null) {
                            n20Var.f80515c = alignment;
                        }
                        Layout.Alignment alignment2 = v93VarA.f83851p;
                        if (alignment2 != null) {
                            n20Var.f80516d = alignment2;
                        }
                    }
                }
            }
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f82566m;
            if (i11 >= (arrayList == null ? 0 : arrayList.size())) {
                return;
            }
            a(i11).a(j10, map, map2, str2, treeMap);
            i11++;
        }
    }

    public final void a(long j10, boolean z10, String str, TreeMap treeMap) {
        this.f82564k.clear();
        this.f82565l.clear();
        if ("metadata".equals(this.f82554a)) {
            return;
        }
        if (!"".equals(this.f82561h)) {
            str = this.f82561h;
        }
        if (this.f82556c && z10) {
            SpannableStringBuilder spannableStringBuilderA = a(str, treeMap);
            String str2 = this.f82555b;
            str2.getClass();
            spannableStringBuilderA.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f82554a) && z10) {
            a(str, treeMap).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap map = this.f82564k;
                String str3 = (String) entry.getKey();
                CharSequence charSequence = ((n20) entry.getValue()).f80513a;
                charSequence.getClass();
                map.put(str3, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(this.f82554a);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f82566m;
                if (i10 >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                a(i10).a(j10, z10 || zEquals, str, treeMap);
                i10++;
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderA2 = a(str, treeMap);
                int length = spannableStringBuilderA2.length() - 1;
                while (length >= 0 && spannableStringBuilderA2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderA2.charAt(length) != '\n') {
                    spannableStringBuilderA2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                HashMap map2 = this.f82565l;
                String str4 = (String) entry2.getKey();
                CharSequence charSequence2 = ((n20) entry2.getValue()).f80513a;
                charSequence2.getClass();
                map2.put(str4, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public static s93 a(String str) {
        return new s93(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", Z7.f27998r).replaceAll("[ \t\\x0B\f\r]+", Z7.f27998r), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final long[] a() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final ArrayList a(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        a(j10, this.f82561h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f82561h, treeMap);
        a(j10, map, map2, this.f82561h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                t93 t93Var = (t93) map2.get(pair.first);
                t93Var.getClass();
                arrayList2.add(new o20(null, null, null, bitmapDecodeByteArray, t93Var.f82936c, 0, t93Var.f82938e, t93Var.f82935b, 0, Integer.MIN_VALUE, -3.4028235E38f, t93Var.f82939f, t93Var.f82940g, false, ViewCompat.MEASURED_STATE_MASK, t93Var.f82943j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            t93 t93Var2 = (t93) map2.get(entry.getKey());
            t93Var2.getClass();
            n20 n20Var = (n20) entry.getValue();
            CharSequence charSequence = n20Var.f80513a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (vf0 vf0Var : (vf0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vf0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(vf0Var), spannableStringBuilder.getSpanEnd(vf0Var), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = t93Var2.f82936c;
            int i18 = t93Var2.f82937d;
            n20Var.f80517e = f10;
            n20Var.f80518f = i18;
            n20Var.f80519g = t93Var2.f82938e;
            n20Var.f80520h = t93Var2.f82935b;
            n20Var.f80524l = t93Var2.f82939f;
            float f11 = t93Var2.f82942i;
            int i19 = t93Var2.f82941h;
            n20Var.f80523k = f11;
            n20Var.f80522j = i19;
            n20Var.f80528p = t93Var2.f82943j;
            arrayList2.add(n20Var.a());
        }
        return arrayList2;
    }
}
