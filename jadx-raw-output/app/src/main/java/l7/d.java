package l7;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import ii.r;

/* JADX INFO: compiled from: TextViewTextChangeEventObservable.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d extends i7.a<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f63492b;

    /* JADX INFO: compiled from: TextViewTextChangeEventObservable.java */
    public static final class a extends ji.a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f63493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? super c> f63494c;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // ji.a
        public void onDispose() {
            this.f63493b.removeTextChangedListener(this);
        }

        public a(TextView textView, r<? super c> rVar) {
            this.f63493b = textView;
            this.f63494c = rVar;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!isDisposed()) {
                this.f63494c.onNext(c.c(this.f63493b, charSequence, i10, i11, i12));
            }
        }
    }

    @Override // i7.a
    public void c(r<? super c> rVar) {
        a aVar = new a(this.f63492b, rVar);
        rVar.onSubscribe(aVar);
        this.f63492b.addTextChangedListener(aVar);
    }

    @Override // i7.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c b() {
        TextView textView = this.f63492b;
        return c.c(textView, textView.getText(), 0, 0, 0);
    }

    public d(TextView textView) {
        this.f63492b = textView;
    }
}
