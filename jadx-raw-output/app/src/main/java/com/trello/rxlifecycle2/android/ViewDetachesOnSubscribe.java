package com.trello.rxlifecycle2.android;

import android.view.View;
import ii.m;
import ii.n;
import ji.a;

/* JADX INFO: loaded from: classes5.dex */
final class ViewDetachesOnSubscribe implements n<Object> {
    public static final Object SIGNAL = new Object();
    public final View view;

    public class EmitterListener extends a implements View.OnAttachStateChangeListener {
        public final m<Object> emitter;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        public EmitterListener(m<Object> mVar) {
            this.emitter = mVar;
        }

        @Override // ji.a
        public void onDispose() {
            ViewDetachesOnSubscribe.this.view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.emitter.onNext(ViewDetachesOnSubscribe.SIGNAL);
        }
    }

    public ViewDetachesOnSubscribe(View view) {
        this.view = view;
    }

    @Override // ii.n
    public void subscribe(m<Object> mVar) throws Exception {
        a.verifyMainThread();
        EmitterListener emitterListener = new EmitterListener(mVar);
        mVar.setDisposable(emitterListener);
        this.view.addOnAttachStateChangeListener(emitterListener);
    }
}
