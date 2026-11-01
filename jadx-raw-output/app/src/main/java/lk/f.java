package lk;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements Iterator<String>, dk.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f63609g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f63610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63614f;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public f(CharSequence charSequence) {
        ck.p.j(charSequence, TypedValues.Custom.S_STRING);
        this.f63610b = charSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11 = this.f63611c;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f63614f < 0) {
            this.f63611c = 2;
            return false;
        }
        int i12 = -1;
        int length = this.f63610b.length();
        int length2 = this.f63610b.length();
        for (int i13 = this.f63612d; i13 < length2; i13++) {
            char cCharAt = this.f63610b.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i12 = (cCharAt == '\r' && (i10 = i13 + 1) < this.f63610b.length() && this.f63610b.charAt(i10) == '\n') ? 2 : 1;
                length = i13;
                break;
            }
        }
        this.f63611c = 1;
        this.f63614f = i12;
        this.f63613e = length;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (hasNext()) {
            this.f63611c = 0;
            int i10 = this.f63613e;
            int i11 = this.f63612d;
            this.f63612d = this.f63614f + i10;
            return this.f63610b.subSequence(i11, i10).toString();
        }
        throw new NoSuchElementException();
    }
}
