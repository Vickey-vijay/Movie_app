package kotlin;

import ck.i;
import ck.p;
import mj.f;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final a Companion = new a(null);
    public static final KotlinVersion CURRENT = f.a();

    /* JADX INFO: compiled from: KotlinVersion.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public KotlinVersion(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.version = versionOf(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final boolean isAtLeast(int i10, int i11) {
        int i12 = this.major;
        return i12 > i10 || (i12 == i10 && this.minor >= i11);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    private final int versionOf(int i10, int i11, int i12) {
        boolean z10;
        if (i10 >= 0 && i10 < 256) {
            if (i11 >= 0 && i11 < 256) {
                z10 = i12 >= 0 && i12 < 256;
            }
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion kotlinVersion) {
        p.j(kotlinVersion, "other");
        return this.version - kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    public KotlinVersion(int i10, int i11) {
        this(i10, i11, 0);
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13;
        int i14 = this.major;
        return i14 > i10 || (i14 == i10 && ((i13 = this.minor) > i11 || (i13 == i11 && this.patch >= i12)));
    }
}
