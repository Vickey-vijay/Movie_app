package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
abstract class Action<T> {
    public boolean cancelled;
    public final Drawable errorDrawable;
    public final int errorResId;
    public final String key;
    public final int memoryPolicy;
    public final int networkPolicy;
    public final boolean noFade;
    public final Picasso picasso;
    public final Request request;
    public final Object tag;
    public final WeakReference<T> target;
    public boolean willReplay;

    public void cancel() {
        this.cancelled = true;
    }

    public abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void error(Exception exc);

    public static class RequestWeakReference<M> extends WeakReference<M> {
        public final Action action;

        public RequestWeakReference(Action action, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.action = action;
        }
    }

    public String getKey() {
        return this.key;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public int getNetworkPolicy() {
        return this.networkPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.request.priority;
    }

    public Request getRequest() {
        return this.request;
    }

    public Object getTag() {
        return this.tag;
    }

    public T getTarget() {
        WeakReference<T> weakReference = this.target;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean willReplay() {
        return this.willReplay;
    }

    public Action(Picasso picasso, T t10, Request request, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        RequestWeakReference requestWeakReference;
        this.picasso = picasso;
        this.request = request;
        if (t10 == null) {
            requestWeakReference = null;
        } else {
            requestWeakReference = new RequestWeakReference(this, t10, picasso.referenceQueue);
        }
        this.target = requestWeakReference;
        this.memoryPolicy = i10;
        this.networkPolicy = i11;
        this.noFade = z10;
        this.errorResId = i12;
        this.errorDrawable = drawable;
        this.key = str;
        this.tag = obj == null ? this : obj;
    }
}
