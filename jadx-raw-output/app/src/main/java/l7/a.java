package l7;

import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;

/* JADX INFO: compiled from: AutoValue_TextViewTextChangeEvent.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f63487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f63488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63491e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f63487a.equals(cVar.f()) && this.f63488b.equals(cVar.e()) && this.f63489c == cVar.d() && this.f63490d == cVar.a() && this.f63491e == cVar.b();
    }

    @Override // l7.c
    public int a() {
        return this.f63490d;
    }

    @Override // l7.c
    public int b() {
        return this.f63491e;
    }

    @Override // l7.c
    public int d() {
        return this.f63489c;
    }

    @Override // l7.c
    @NonNull
    public CharSequence e() {
        return this.f63488b;
    }

    @Override // l7.c
    @NonNull
    public TextView f() {
        return this.f63487a;
    }

    public int hashCode() {
        return ((((((((this.f63487a.hashCode() ^ 1000003) * 1000003) ^ this.f63488b.hashCode()) * 1000003) ^ this.f63489c) * 1000003) ^ this.f63490d) * 1000003) ^ this.f63491e;
    }

    public String toString() {
        return "TextViewTextChangeEvent{view=" + this.f63487a + ", text=" + ((Object) this.f63488b) + ", start=" + this.f63489c + ", before=" + this.f63490d + ", count=" + this.f63491e + h.f44172e;
    }

    public a(TextView textView, CharSequence charSequence, int i10, int i11, int i12) {
        if (textView != null) {
            this.f63487a = textView;
            if (charSequence != null) {
                this.f63488b = charSequence;
                this.f63489c = i10;
                this.f63490d = i11;
                this.f63491e = i12;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }
}
