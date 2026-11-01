package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import g5.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k3.q0;
import k3.r0;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f19804g = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.c.b f19805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<Parameters> f19806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19807f;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR;
        public static final Parameters G;

        @Deprecated
        public static final Parameters H;

        @Deprecated
        public static final Parameters I;

        @Deprecated
        public final boolean A;

        @Deprecated
        public final boolean B;
        public final boolean C;
        public final int D;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> E;
        public final SparseBooleanArray F;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f19808i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f19809j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f19810k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f19811l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f19812m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f19813n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f19814o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f19815p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f19816q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f19817r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f19818s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f19819t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f19820u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f19821v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f19822w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f19823x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f19824y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final boolean f19825z;

        public class a implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Parameters[] newArray(int i10) {
                return new Parameters[i10];
            }
        }

        public Parameters(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, int i14, int i15, boolean z13, @Nullable String str, int i16, int i17, boolean z14, boolean z15, boolean z16, boolean z17, @Nullable String str2, int i18, boolean z18, int i19, boolean z19, boolean z20, boolean z21, int i20, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, str2, i18, z18, i19);
            this.f19808i = i10;
            this.f19809j = i11;
            this.f19810k = i12;
            this.f19811l = i13;
            this.f19812m = z10;
            this.f19813n = z11;
            this.f19814o = z12;
            this.f19815p = i14;
            this.f19816q = i15;
            this.f19817r = z13;
            this.f19818s = i16;
            this.f19819t = i17;
            this.f19820u = z14;
            this.f19821v = z15;
            this.f19822w = z16;
            this.f19823x = z17;
            this.f19824y = z19;
            this.f19825z = z20;
            this.C = z21;
            this.D = i20;
            this.A = z11;
            this.B = z12;
            this.E = sparseArray;
            this.F = sparseBooleanArray;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(obj) && this.f19808i == parameters.f19808i && this.f19809j == parameters.f19809j && this.f19810k == parameters.f19810k && this.f19811l == parameters.f19811l && this.f19812m == parameters.f19812m && this.f19813n == parameters.f19813n && this.f19814o == parameters.f19814o && this.f19817r == parameters.f19817r && this.f19815p == parameters.f19815p && this.f19816q == parameters.f19816q && this.f19818s == parameters.f19818s && this.f19819t == parameters.f19819t && this.f19820u == parameters.f19820u && this.f19821v == parameters.f19821v && this.f19822w == parameters.f19822w && this.f19823x == parameters.f19823x && this.f19824y == parameters.f19824y && this.f19825z == parameters.f19825z && this.C == parameters.C && this.D == parameters.D && c(this.F, parameters.F) && d(this.E, parameters.E);
        }

        static {
            Parameters parametersA = new d().a();
            G = parametersA;
            H = parametersA;
            I = parametersA;
            CREATOR = new a();
        }

        public static Parameters g(Context context) {
            return new d(context).a();
        }

        public d f() {
            return new d(this);
        }

        public final boolean h(int i10) {
            return this.F.get(i10);
        }

        @Nullable
        public final SelectionOverride i(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.E.get(i10);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean j(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.E.get(i10);
            return map != null && map.containsKey(trackGroupArray);
        }

        public static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !e(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !k0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> k(Parcel parcel) {
            int i10 = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                HashMap map = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    map.put((TrackGroupArray) g5.a.e((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i12, map);
            }
            return sparseArray;
        }

        public static void l(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = sparseArray.valueAt(i10);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f19808i) * 31) + this.f19809j) * 31) + this.f19810k) * 31) + this.f19811l) * 31) + (this.f19812m ? 1 : 0)) * 31) + (this.f19813n ? 1 : 0)) * 31) + (this.f19814o ? 1 : 0)) * 31) + (this.f19817r ? 1 : 0)) * 31) + this.f19815p) * 31) + this.f19816q) * 31) + this.f19818s) * 31) + this.f19819t) * 31) + (this.f19820u ? 1 : 0)) * 31) + (this.f19821v ? 1 : 0)) * 31) + (this.f19822w ? 1 : 0)) * 31) + (this.f19823x ? 1 : 0)) * 31) + (this.f19824y ? 1 : 0)) * 31) + (this.f19825z ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19808i);
            parcel.writeInt(this.f19809j);
            parcel.writeInt(this.f19810k);
            parcel.writeInt(this.f19811l);
            k0.O0(parcel, this.f19812m);
            k0.O0(parcel, this.f19813n);
            k0.O0(parcel, this.f19814o);
            parcel.writeInt(this.f19815p);
            parcel.writeInt(this.f19816q);
            k0.O0(parcel, this.f19817r);
            parcel.writeInt(this.f19818s);
            parcel.writeInt(this.f19819t);
            k0.O0(parcel, this.f19820u);
            k0.O0(parcel, this.f19821v);
            k0.O0(parcel, this.f19822w);
            k0.O0(parcel, this.f19823x);
            k0.O0(parcel, this.f19824y);
            k0.O0(parcel, this.f19825z);
            k0.O0(parcel, this.C);
            parcel.writeInt(this.D);
            l(parcel, this.E);
            parcel.writeSparseBooleanArray(this.F);
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.f19808i = parcel.readInt();
            this.f19809j = parcel.readInt();
            this.f19810k = parcel.readInt();
            this.f19811l = parcel.readInt();
            this.f19812m = k0.u0(parcel);
            boolean zU0 = k0.u0(parcel);
            this.f19813n = zU0;
            boolean zU1 = k0.u0(parcel);
            this.f19814o = zU1;
            this.f19815p = parcel.readInt();
            this.f19816q = parcel.readInt();
            this.f19817r = k0.u0(parcel);
            this.f19818s = parcel.readInt();
            this.f19819t = parcel.readInt();
            this.f19820u = k0.u0(parcel);
            this.f19821v = k0.u0(parcel);
            this.f19822w = k0.u0(parcel);
            this.f19823x = k0.u0(parcel);
            this.f19824y = k0.u0(parcel);
            this.f19825z = k0.u0(parcel);
            this.C = k0.u0(parcel);
            this.D = parcel.readInt();
            this.E = k(parcel);
            this.F = (SparseBooleanArray) k0.i(parcel.readSparseBooleanArray());
            this.A = zU0;
            this.B = zU1;
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f19827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19830f;

        public class a implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SelectionOverride[] newArray(int i10) {
                return new SelectionOverride[i10];
            }
        }

        public SelectionOverride(int i10, int... iArr) {
            this(i10, iArr, 2, 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.f19826b == selectionOverride.f19826b && Arrays.equals(this.f19827c, selectionOverride.f19827c) && this.f19829e == selectionOverride.f19829e && this.f19830f == selectionOverride.f19830f;
        }

        public SelectionOverride(int i10, int[] iArr, int i11, int i12) {
            this.f19826b = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f19827c = iArrCopyOf;
            this.f19828d = iArr.length;
            this.f19829e = i11;
            this.f19830f = i12;
            Arrays.sort(iArrCopyOf);
        }

        public boolean a(int i10) {
            for (int i11 : this.f19827c) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f19826b * 31) + Arrays.hashCode(this.f19827c)) * 31) + this.f19829e) * 31) + this.f19830f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f19826b);
            parcel.writeInt(this.f19827c.length);
            parcel.writeIntArray(this.f19827c);
            parcel.writeInt(this.f19829e);
            parcel.writeInt(this.f19830f);
        }

        public SelectionOverride(Parcel parcel) {
            this.f19826b = parcel.readInt();
            int i10 = parcel.readByte();
            this.f19828d = i10;
            int[] iArr = new int[i10];
            this.f19827c = iArr;
            parcel.readIntArray(iArr);
            this.f19829e = parcel.readInt();
            this.f19830f = parcel.readInt();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f19833c;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19831a == bVar.f19831a && this.f19832b == bVar.f19832b && TextUtils.equals(this.f19833c, bVar.f19833c);
        }

        public int hashCode() {
            int i10 = ((this.f19831a * 31) + this.f19832b) * 31;
            String str = this.f19833c;
            return i10 + (str != null ? str.hashCode() : 0);
        }

        public b(int i10, int i11, @Nullable String str) {
            this.f19831a = i10;
            this.f19832b = i11;
            this.f19833c = str;
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f19835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Parameters f19836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19840h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f19841i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f19842j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f19843k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f19844l;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int iN;
            int iM;
            boolean z10 = this.f19837e;
            if (z10 != cVar.f19837e) {
                return z10 ? 1 : -1;
            }
            int i10 = this.f19838f;
            int i11 = cVar.f19838f;
            if (i10 != i11) {
                return DefaultTrackSelector.n(i10, i11);
            }
            boolean z11 = this.f19834b;
            if (z11 != cVar.f19834b) {
                return z11 ? 1 : -1;
            }
            if (this.f19836d.f19824y && (iM = DefaultTrackSelector.m(this.f19844l, cVar.f19844l)) != 0) {
                return iM > 0 ? -1 : 1;
            }
            boolean z12 = this.f19841i;
            if (z12 != cVar.f19841i) {
                return z12 ? 1 : -1;
            }
            int i12 = this.f19839g;
            int i13 = cVar.f19839g;
            if (i12 != i13) {
                return -DefaultTrackSelector.n(i12, i13);
            }
            int i14 = this.f19840h;
            int i15 = cVar.f19840h;
            if (i14 != i15) {
                return DefaultTrackSelector.n(i14, i15);
            }
            int i16 = (this.f19834b && this.f19837e) ? 1 : -1;
            int i17 = this.f19842j;
            int i18 = cVar.f19842j;
            if (i17 != i18) {
                iN = DefaultTrackSelector.n(i17, i18);
            } else {
                int i19 = this.f19843k;
                int i20 = cVar.f19843k;
                if (i19 != i20) {
                    iN = DefaultTrackSelector.n(i19, i20);
                } else {
                    if (!k0.c(this.f19835c, cVar.f19835c)) {
                        return 0;
                    }
                    iN = DefaultTrackSelector.n(this.f19844l, cVar.f19844l);
                }
            }
            return i16 * iN;
        }

        public c(Format format, Parameters parameters, int i10) {
            boolean z10;
            this.f19836d = parameters;
            this.f19835c = DefaultTrackSelector.B(format.B);
            int i11 = 0;
            this.f19837e = DefaultTrackSelector.x(i10, false);
            this.f19838f = DefaultTrackSelector.t(format, parameters.f19876b, false);
            boolean z11 = true;
            if ((format.f18964d & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f19841i = z10;
            int i12 = format.f18983w;
            this.f19842j = i12;
            this.f19843k = format.f18984x;
            int i13 = format.f18966f;
            this.f19844l = i13;
            if ((i13 != -1 && i13 > parameters.f19819t) || (i12 != -1 && i12 > parameters.f19818s)) {
                z11 = false;
            }
            this.f19834b = z11;
            String[] strArrW = k0.W();
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < strArrW.length; i15++) {
                int iT = DefaultTrackSelector.t(format, strArrW[i15], false);
                if (iT > 0) {
                    i14 = i15;
                    i11 = iT;
                    break;
                }
            }
            this.f19839g = i14;
            this.f19840h = i11;
        }
    }

    public static final class d extends TrackSelectionParameters.b {
        public final SparseBooleanArray A;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19847h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19848i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19849j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19850k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19851l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19852m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19853n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f19854o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19855p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f19856q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f19857r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f19858s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f19859t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f19860u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f19861v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f19862w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f19863x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f19864y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f19865z;

        @Deprecated
        public d() {
            h();
            this.f19865z = new SparseArray<>();
            this.A = new SparseBooleanArray();
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> g(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Parameters a() {
            return new Parameters(this.f19845f, this.f19846g, this.f19847h, this.f19848i, this.f19849j, this.f19850k, this.f19851l, this.f19852m, this.f19853n, this.f19854o, this.f19881a, this.f19855p, this.f19856q, this.f19857r, this.f19858s, this.f19859t, this.f19860u, this.f19882b, this.f19883c, this.f19884d, this.f19885e, this.f19861v, this.f19862w, this.f19863x, this.f19864y, this.f19865z, this.A);
        }

        public d l(int i10, int i11, boolean z10) {
            this.f19852m = i10;
            this.f19853n = i11;
            this.f19854o = z10;
            return this;
        }

        public final void h() {
            this.f19845f = Integer.MAX_VALUE;
            this.f19846g = Integer.MAX_VALUE;
            this.f19847h = Integer.MAX_VALUE;
            this.f19848i = Integer.MAX_VALUE;
            this.f19849j = true;
            this.f19850k = false;
            this.f19851l = true;
            this.f19852m = Integer.MAX_VALUE;
            this.f19853n = Integer.MAX_VALUE;
            this.f19854o = true;
            this.f19855p = Integer.MAX_VALUE;
            this.f19856q = Integer.MAX_VALUE;
            this.f19857r = true;
            this.f19858s = false;
            this.f19859t = false;
            this.f19860u = false;
            this.f19861v = false;
            this.f19862w = false;
            this.f19863x = true;
            this.f19864y = 0;
        }

        public d i(@Nullable String str) {
            super.b(str);
            return this;
        }

        public d j(@Nullable String str) {
            super.c(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public d d(Context context) {
            super.d(context);
            return this;
        }

        public d m(Context context, boolean z10) {
            Point pointG = k0.G(context);
            return l(pointG.x, pointG.y, z10);
        }

        public d(Context context) {
            super(context);
            h();
            this.f19865z = new SparseArray<>();
            this.A = new SparseBooleanArray();
            m(context, true);
        }

        public d(Parameters parameters) {
            super(parameters);
            this.f19845f = parameters.f19808i;
            this.f19846g = parameters.f19809j;
            this.f19847h = parameters.f19810k;
            this.f19848i = parameters.f19811l;
            this.f19849j = parameters.f19812m;
            this.f19850k = parameters.f19813n;
            this.f19851l = parameters.f19814o;
            this.f19852m = parameters.f19815p;
            this.f19853n = parameters.f19816q;
            this.f19854o = parameters.f19817r;
            this.f19855p = parameters.f19818s;
            this.f19856q = parameters.f19819t;
            this.f19857r = parameters.f19820u;
            this.f19858s = parameters.f19821v;
            this.f19859t = parameters.f19822w;
            this.f19860u = parameters.f19823x;
            this.f19861v = parameters.f19824y;
            this.f19862w = parameters.f19825z;
            this.f19863x = parameters.C;
            this.f19864y = parameters.D;
            this.f19865z = g(parameters.E);
            this.A = parameters.F.clone();
        }
    }

    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19872h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f19873i;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            boolean z10;
            boolean z11 = this.f19867c;
            if (z11 != eVar.f19867c) {
                return z11 ? 1 : -1;
            }
            int i10 = this.f19870f;
            int i11 = eVar.f19870f;
            if (i10 != i11) {
                return DefaultTrackSelector.n(i10, i11);
            }
            int i12 = this.f19871g;
            int i13 = eVar.f19871g;
            if (i12 != i13) {
                return DefaultTrackSelector.n(i12, i13);
            }
            boolean z12 = this.f19868d;
            if (z12 != eVar.f19868d) {
                return z12 ? 1 : -1;
            }
            boolean z13 = this.f19869e;
            if (z13 != eVar.f19869e) {
                return z13 ? 1 : -1;
            }
            int i14 = this.f19872h;
            int i15 = eVar.f19872h;
            if (i14 != i15) {
                return DefaultTrackSelector.n(i14, i15);
            }
            if (i12 != 0 || (z10 = this.f19873i) == eVar.f19873i) {
                return 0;
            }
            return z10 ? -1 : 1;
        }

        public e(Format format, Parameters parameters, int i10, @Nullable String str) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15 = false;
            this.f19867c = DefaultTrackSelector.x(i10, false);
            int i11 = format.f18964d & (~parameters.f19880f);
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f19868d = z10;
            if ((i11 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int iT = DefaultTrackSelector.t(format, parameters.f19877c, parameters.f19879e);
            this.f19870f = iT;
            int iBitCount = Integer.bitCount(format.f18965e & parameters.f19878d);
            this.f19871g = iBitCount;
            if ((format.f18965e & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f19873i = z12;
            if ((iT > 0 && !z11) || (iT == 0 && z11)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f19869e = z13;
            if (DefaultTrackSelector.B(str) == null) {
                z14 = true;
            } else {
                z14 = false;
            }
            int iT2 = DefaultTrackSelector.t(format, str, z14);
            this.f19872h = iT2;
            if (iT > 0 || ((parameters.f19877c == null && iBitCount > 0) || z10 || (z11 && iT2 > 0))) {
                z15 = true;
            }
            this.f19866b = z15;
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(new com.google.android.exoplayer2.trackselection.a.d());
    }

    public static boolean C(int[][] iArr, TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.c cVar) {
        if (cVar == null) {
            return false;
        }
        int iB = trackGroupArray.b(cVar.getTrackGroup());
        for (int i10 = 0; i10 < cVar.length(); i10++) {
            if (q0.getTunnelingSupport(iArr[iB][cVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static int m(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static int n(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static int p(TrackGroup trackGroup, int[] iArr, b bVar, int i10, boolean z10, boolean z11, boolean z12) {
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroup.f19431b; i12++) {
            if (y(trackGroup.a(i12), iArr[i12], bVar, i10, z10, z11, z12)) {
                i11++;
            }
        }
        return i11;
    }

    public static int r(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, int i14, List<Integer> list) {
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            int iIntValue = list.get(i16).intValue();
            if (z(trackGroup.a(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14)) {
                i15++;
            }
        }
        return i15;
    }

    public static boolean y(Format format, int i10, b bVar, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        String str;
        int i13;
        if (!x(i10, false)) {
            return false;
        }
        int i14 = format.f18966f;
        if (i14 != -1 && i14 > i11) {
            return false;
        }
        if (!z12 && ((i13 = format.f18983w) == -1 || i13 != bVar.f19831a)) {
            return false;
        }
        if (z10 || ((str = format.f18970j) != null && TextUtils.equals(str, bVar.f19833c))) {
            return z11 || ((i12 = format.f18984x) != -1 && i12 == bVar.f19832b);
        }
        return false;
    }

    @Nullable
    public com.google.android.exoplayer2.trackselection.c.a H(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroupArray.f19435b; i13++) {
            TrackGroup trackGroupA = trackGroupArray.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroupA.f19431b; i14++) {
                if (x(iArr2[i14], parameters.C)) {
                    int i15 = (trackGroupA.a(i14).f18964d & 1) != 0 ? 2 : 1;
                    if (x(iArr2[i14], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i12) {
                        trackGroup = trackGroupA;
                        i11 = i14;
                        i12 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.c.a(trackGroup, i11);
    }

    @Deprecated
    public DefaultTrackSelector(com.google.android.exoplayer2.trackselection.c.b bVar) {
        this(Parameters.G, bVar);
    }

    public static void A(com.google.android.exoplayer2.trackselection.b.a aVar, int[][][] iArr, r0[] r0VarArr, com.google.android.exoplayer2.trackselection.c[] cVarArr, int i10) {
        boolean z10;
        if (i10 == 0) {
            return;
        }
        boolean z11 = false;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i11 >= aVar.c()) {
                z10 = true;
                break;
            }
            int iD = aVar.d(i11);
            com.google.android.exoplayer2.trackselection.c cVar = cVarArr[i11];
            if ((iD == 1 || iD == 2) && cVar != null && C(iArr[i11], aVar.e(i11), cVar)) {
                if (iD == 1) {
                    if (i13 != -1) {
                        z10 = false;
                        break;
                    }
                    i13 = i11;
                } else {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i11;
                }
            }
            i11++;
        }
        if (i13 != -1 && i12 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            r0 r0Var = new r0(i10);
            r0VarArr[i13] = r0Var;
            r0VarArr[i12] = r0Var;
        }
    }

    @Nullable
    public static com.google.android.exoplayer2.trackselection.c.a D(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters) {
        int i11 = parameters.f19814o ? 24 : 16;
        boolean z10 = parameters.f19813n && (i10 & i11) != 0;
        for (int i12 = 0; i12 < trackGroupArray.f19435b; i12++) {
            TrackGroup trackGroupA = trackGroupArray.a(i12);
            int[] iArrS = s(trackGroupA, iArr[i12], z10, i11, parameters.f19808i, parameters.f19809j, parameters.f19810k, parameters.f19811l, parameters.f19815p, parameters.f19816q, parameters.f19817r);
            if (iArrS.length > 0) {
                return new com.google.android.exoplayer2.trackselection.c.a(trackGroupA, iArrS);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    @Nullable
    public static com.google.android.exoplayer2.trackselection.c.a G(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13 = -1;
        int i14 = -1;
        int iD = -1;
        int i15 = 0;
        TrackGroup trackGroup2 = null;
        int i16 = 0;
        int i17 = 0;
        while (i15 < trackGroupArray.f19435b) {
            TrackGroup trackGroupA = trackGroupArray.a(i15);
            List<Integer> listW = w(trackGroupA, parameters.f19815p, parameters.f19816q, parameters.f19817r);
            int[] iArr2 = iArr[i15];
            int i18 = 0;
            while (i18 < trackGroupA.f19431b) {
                Format formatA = trackGroupA.a(i18);
                if ((formatA.f18965e & 16384) == 0 && x(iArr2[i18], parameters.C)) {
                    if (!listW.contains(Integer.valueOf(i18)) || (((i10 = formatA.f18975o) != i13 && i10 > parameters.f19808i) || ((i11 = formatA.f18976p) != i13 && i11 > parameters.f19809j))) {
                        z10 = false;
                    } else {
                        float f10 = formatA.f18977q;
                        if ((f10 == -1.0f || f10 <= parameters.f19810k) && ((i12 = formatA.f18966f) == i13 || i12 <= parameters.f19811l)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10 || parameters.f19812m) {
                        int i19 = z10 ? 2 : 1;
                        boolean zX = x(iArr2[i18], false);
                        if (zX) {
                            i19 += 1000;
                        }
                        boolean z11 = i19 > i17;
                        if (i19 == i17) {
                            int iM = m(formatA.f18966f, i14);
                            trackGroup = trackGroup2;
                            if (!parameters.f19824y || iM == 0) {
                                int iD2 = formatA.D();
                                int iM2 = iD2 != iD ? m(iD2, iD) : m(formatA.f18966f, i14);
                                if (!(zX && z10) ? iM2 < 0 : iM2 > 0) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                            } else if (iM < 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            trackGroup = trackGroup2;
                        }
                        if (z11) {
                            i14 = formatA.f18966f;
                            iD = formatA.D();
                            trackGroup2 = trackGroupA;
                            i17 = i19;
                            i16 = i18;
                        }
                    } else {
                        trackGroup = trackGroup2;
                    }
                    trackGroup2 = trackGroup;
                } else {
                    trackGroup = trackGroup2;
                    trackGroup2 = trackGroup;
                }
                i18++;
                i13 = -1;
            }
            i15++;
            i13 = -1;
        }
        if (trackGroup2 == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.c.a(trackGroup2, i16);
    }

    public static void o(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, int i14, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!z(trackGroup.a(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14)) {
                list.remove(size);
            }
        }
    }

    public static int[] q(TrackGroup trackGroup, int[] iArr, int i10, boolean z10, boolean z11, boolean z12) {
        int iP;
        HashSet hashSet = new HashSet();
        b bVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroup.f19431b; i12++) {
            Format formatA = trackGroup.a(i12);
            b bVar2 = new b(formatA.f18983w, formatA.f18984x, formatA.f18970j);
            if (hashSet.add(bVar2) && (iP = p(trackGroup, iArr, bVar2, i10, z10, z11, z12)) > i11) {
                i11 = iP;
                bVar = bVar2;
            }
        }
        if (i11 <= 1) {
            return f19804g;
        }
        g5.a.e(bVar);
        int[] iArr2 = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < trackGroup.f19431b; i14++) {
            if (y(trackGroup.a(i14), iArr[i14], bVar, i10, z10, z11, z12)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return iArr2;
    }

    public static int[] s(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        String str;
        int iR;
        if (trackGroup.f19431b < 2) {
            return f19804g;
        }
        List<Integer> listW = w(trackGroup, i15, i16, z11);
        if (listW.size() < 2) {
            return f19804g;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i17 = 0;
            for (int i18 = 0; i18 < listW.size(); i18++) {
                String str3 = trackGroup.a(listW.get(i18).intValue()).f18970j;
                if (hashSet.add(str3) && (iR = r(trackGroup, iArr, i10, str3, i11, i12, i13, i14, listW)) > i17) {
                    i17 = iR;
                    str2 = str3;
                }
            }
            str = str2;
        }
        o(trackGroup, iArr, i10, str, i11, i12, i13, i14, listW);
        return listW.size() < 2 ? f19804g : k0.I0(listW);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    public static Point u(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) == (i10 > i11)) {
                i11 = i10;
                i10 = i11;
            }
        } else {
            i11 = i10;
            i10 = i11;
        }
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, k0.k(i15, i12)) : new Point(k0.k(i14, i13), i10);
    }

    public static List<Integer> w(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(trackGroup.f19431b);
        for (int i13 = 0; i13 < trackGroup.f19431b; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < trackGroup.f19431b; i15++) {
                Format formatA = trackGroup.a(i15);
                int i16 = formatA.f18975o;
                if (i16 > 0 && (i12 = formatA.f18976p) > 0) {
                    Point pointU = u(z10, i10, i11, i16, i12);
                    int i17 = formatA.f18975o;
                    int i18 = formatA.f18976p;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointU.x * 0.98f)) && i18 >= ((int) (pointU.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iD = trackGroup.a(((Integer) arrayList.get(size)).intValue()).D();
                    if (iD == -1 || iD > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean z(Format format, @Nullable String str, int i10, int i11, int i12, int i13, int i14, int i15) {
        if ((format.f18965e & 16384) != 0 || !x(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !k0.c(format.f18970j, str)) {
            return false;
        }
        int i16 = format.f18975o;
        if (i16 != -1 && i16 > i12) {
            return false;
        }
        int i17 = format.f18976p;
        if (i17 != -1 && i17 > i13) {
            return false;
        }
        float f10 = format.f18977q;
        if (f10 != -1.0f && f10 > i14) {
            return false;
        }
        int i18 = format.f18966f;
        return i18 == -1 || i18 <= i15;
    }

    public com.google.android.exoplayer2.trackselection.c.a[] E(com.google.android.exoplayer2.trackselection.b.a aVar, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        boolean z10;
        String str;
        int i10;
        c cVar;
        String str2;
        int i11;
        int iC = aVar.c();
        com.google.android.exoplayer2.trackselection.c.a[] aVarArr = new com.google.android.exoplayer2.trackselection.c.a[iC];
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            z10 = true;
            if (i13 >= iC) {
                break;
            }
            if (2 == aVar.d(i13)) {
                if (!z11) {
                    com.google.android.exoplayer2.trackselection.c.a aVarJ = J(aVar.e(i13), iArr[i13], iArr2[i13], parameters, true);
                    aVarArr[i13] = aVarJ;
                    z11 = aVarJ != null;
                }
                z12 |= aVar.e(i13).f19435b > 0;
            }
            i13++;
        }
        int i14 = 0;
        int i15 = -1;
        c cVar2 = null;
        String str3 = null;
        while (i14 < iC) {
            if (z10 == aVar.d(i14)) {
                boolean z13 = (this.f19807f || !z12) ? z10 : false;
                i10 = i15;
                cVar = cVar2;
                str2 = str3;
                i11 = i14;
                Pair<com.google.android.exoplayer2.trackselection.c.a, c> pairF = F(aVar.e(i14), iArr[i14], iArr2[i14], parameters, z13);
                if (pairF != null && (cVar == null || ((c) pairF.second).compareTo(cVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    com.google.android.exoplayer2.trackselection.c.a aVar2 = (com.google.android.exoplayer2.trackselection.c.a) pairF.first;
                    aVarArr[i11] = aVar2;
                    str3 = aVar2.f19917a.a(aVar2.f19918b[0]).B;
                    cVar2 = (c) pairF.second;
                    i15 = i11;
                }
                i14 = i11 + 1;
                z10 = true;
            } else {
                i10 = i15;
                cVar = cVar2;
                str2 = str3;
                i11 = i14;
            }
            i15 = i10;
            cVar2 = cVar;
            str3 = str2;
            i14 = i11 + 1;
            z10 = true;
        }
        String str4 = str3;
        int i16 = -1;
        e eVar = null;
        while (i12 < iC) {
            int iD = aVar.d(i12);
            if (iD == 1) {
                str = str4;
            } else if (iD == 2) {
                str = str4;
            } else if (iD != 3) {
                aVarArr[i12] = H(iD, aVar.e(i12), iArr[i12], parameters);
                str = str4;
            } else {
                str = str4;
                Pair<com.google.android.exoplayer2.trackselection.c.a, e> pairI = I(aVar.e(i12), iArr[i12], parameters, str);
                if (pairI != null && (eVar == null || ((e) pairI.second).compareTo(eVar) > 0)) {
                    if (i16 != -1) {
                        aVarArr[i16] = null;
                    }
                    aVarArr[i12] = (com.google.android.exoplayer2.trackselection.c.a) pairI.first;
                    eVar = (e) pairI.second;
                    i16 = i12;
                }
            }
            i12++;
            str4 = str;
        }
        return aVarArr;
    }

    @Nullable
    public Pair<com.google.android.exoplayer2.trackselection.c.a, c> F(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.c.a aVar = null;
        c cVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < trackGroupArray.f19435b; i13++) {
            TrackGroup trackGroupA = trackGroupArray.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroupA.f19431b; i14++) {
                if (x(iArr2[i14], parameters.C)) {
                    c cVar2 = new c(trackGroupA.a(i14), parameters, iArr2[i14]);
                    if ((cVar2.f19834b || parameters.f19820u) && (cVar == null || cVar2.compareTo(cVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroupA2 = trackGroupArray.a(i11);
        if (!parameters.f19825z && !parameters.f19824y && z10) {
            int[] iArrQ = q(trackGroupA2, iArr[i11], parameters.f19819t, parameters.f19821v, parameters.f19822w, parameters.f19823x);
            if (iArrQ.length > 0) {
                aVar = new com.google.android.exoplayer2.trackselection.c.a(trackGroupA2, iArrQ);
            }
        }
        if (aVar == null) {
            aVar = new com.google.android.exoplayer2.trackselection.c.a(trackGroupA2, i12);
        }
        return Pair.create(aVar, (c) g5.a.e(cVar));
    }

    @Nullable
    public Pair<com.google.android.exoplayer2.trackselection.c.a, e> I(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, @Nullable String str) throws ExoPlaybackException {
        int i10 = -1;
        TrackGroup trackGroup = null;
        e eVar = null;
        for (int i11 = 0; i11 < trackGroupArray.f19435b; i11++) {
            TrackGroup trackGroupA = trackGroupArray.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroupA.f19431b; i12++) {
                if (x(iArr2[i12], parameters.C)) {
                    e eVar2 = new e(trackGroupA.a(i12), parameters, iArr2[i12], str);
                    if (eVar2.f19866b && (eVar == null || eVar2.compareTo(eVar) > 0)) {
                        trackGroup = trackGroupA;
                        i10 = i12;
                        eVar = eVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new com.google.android.exoplayer2.trackselection.c.a(trackGroup, i10), (e) g5.a.e(eVar));
    }

    @Nullable
    public com.google.android.exoplayer2.trackselection.c.a J(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.c.a aVarD = (parameters.f19825z || parameters.f19824y || !z10) ? null : D(trackGroupArray, iArr, i10, parameters);
        return aVarD == null ? G(trackGroupArray, iArr, parameters) : aVarD;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public final Pair<r0[], com.google.android.exoplayer2.trackselection.c[]> j(com.google.android.exoplayer2.trackselection.b.a aVar, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        Parameters parameters = this.f19806e.get();
        int iC = aVar.c();
        com.google.android.exoplayer2.trackselection.c.a[] aVarArrE = E(aVar, iArr, iArr2, parameters);
        int i10 = 0;
        while (true) {
            if (i10 >= iC) {
                break;
            }
            if (parameters.h(i10)) {
                aVarArrE[i10] = null;
            } else {
                TrackGroupArray trackGroupArrayE = aVar.e(i10);
                if (parameters.j(i10, trackGroupArrayE)) {
                    SelectionOverride selectionOverrideI = parameters.i(i10, trackGroupArrayE);
                    aVarArrE[i10] = selectionOverrideI != null ? new com.google.android.exoplayer2.trackselection.c.a(trackGroupArrayE.a(selectionOverrideI.f19826b), selectionOverrideI.f19827c, selectionOverrideI.f19829e, Integer.valueOf(selectionOverrideI.f19830f)) : null;
                }
            }
            i10++;
        }
        com.google.android.exoplayer2.trackselection.c[] cVarArrA = this.f19805d.a(aVarArrE, a());
        r0[] r0VarArr = new r0[iC];
        for (int i11 = 0; i11 < iC; i11++) {
            r0VarArr[i11] = !parameters.h(i11) && (aVar.d(i11) == 6 || cVarArrA[i11] != null) ? r0.f62237b : null;
        }
        A(aVar, iArr, r0VarArr, cVarArrA, parameters.D);
        return Pair.create(r0VarArr, cVarArrA);
    }

    public Parameters v() {
        return this.f19806e.get();
    }

    public DefaultTrackSelector(Context context) {
        this(context, new com.google.android.exoplayer2.trackselection.a.d());
    }

    @Nullable
    public static String B(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int t(Format format, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(format.B)) {
            return 4;
        }
        String strB = B(str);
        String strB2 = B(format.B);
        if (strB2 != null && strB != null) {
            if (!strB2.startsWith(strB) && !strB.startsWith(strB2)) {
                if (!k0.E0(strB2, "-")[0].equals(k0.E0(strB, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || strB2 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean x(int i10, boolean z10) {
        int formatSupport = q0.getFormatSupport(i10);
        if (formatSupport != 4 && (!z10 || formatSupport != 3)) {
            return false;
        }
        return true;
    }

    public void K(Parameters parameters) {
        g5.a.e(parameters);
        if (!this.f19806e.getAndSet(parameters).equals(parameters)) {
            c();
        }
    }

    public void L(d dVar) {
        K(dVar.a());
    }

    public DefaultTrackSelector(Context context, com.google.android.exoplayer2.trackselection.c.b bVar) {
        this(Parameters.g(context), bVar);
    }

    public DefaultTrackSelector(Parameters parameters, com.google.android.exoplayer2.trackselection.c.b bVar) {
        this.f19805d = bVar;
        this.f19806e = new AtomicReference<>(parameters);
    }
}
