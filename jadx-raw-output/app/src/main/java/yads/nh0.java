package yads;

import android.content.Context;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import yads.nh0;

/* JADX INFO: loaded from: classes6.dex */
public final class nh0 implements DivImageLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d03 f80672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh1 f80673b = new mh1();

    public final LoadReference a(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.f80673b.a(new Runnable() { // from class: cp.v6
            @Override // java.lang.Runnable
            public final void run() {
                nh0.a(ref$ObjectRef, this, str, divImageDownloadCallback);
            }
        });
        return new LoadReference() { // from class: cp.w6
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                nh0.a(this.f51664a, ref$ObjectRef);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Ref$ObjectRef ref$ObjectRef) {
        i41 i41Var = (i41) ref$ObjectRef.element;
        if (i41Var != null) {
            i41Var.a();
        }
    }

    public nh0(Context context) {
        this.f80672a = w82.f84125d.a(context).b();
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, yads.i41] */
    public static final void a(Ref$ObjectRef ref$ObjectRef, nh0 nh0Var, String str, DivImageDownloadCallback divImageDownloadCallback) {
        ref$ObjectRef.element = nh0Var.f80672a.a(str, new mh0(str, divImageDownloadCallback), 0, 0);
    }

    public static final void a(nh0 nh0Var, final Ref$ObjectRef ref$ObjectRef) {
        nh0Var.f80673b.a(new Runnable() { // from class: cp.x6
            @Override // java.lang.Runnable
            public final void run() {
                nh0.b(ref$ObjectRef);
            }
        });
    }
}
