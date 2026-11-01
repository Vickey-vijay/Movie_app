package q1;

import android.os.Handler;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: RequestProgress.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001c"}, d2 = {"Lq1/i0;", "", "", "size", "Lmj/r;", "b", "c", "d", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "callbackHandler", "Lcom/facebook/GraphRequest;", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "J", "threshold", "<set-?>", "getProgress", "()J", "progress", "e", "lastReportedProgress", InneractiveMediationDefs.GENDER_FEMALE, "getMaxProgress", "maxProgress", "<init>", "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Handler callbackHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final GraphRequest request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long threshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long lastReportedProgress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long maxProgress;

    public i0(Handler handler, GraphRequest graphRequest) {
        ck.p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
        this.callbackHandler = handler;
        this.request = graphRequest;
        this.threshold = t.A();
    }

    public static final void e(GraphRequest.b bVar, long j10, long j11) {
        ((GraphRequest.f) bVar).a(j10, j11);
    }

    public final void b(long j10) {
        long j11 = this.progress + j10;
        this.progress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            d();
        }
    }

    public final void c(long j10) {
        this.maxProgress += j10;
    }

    public final void d() {
        if (this.progress > this.lastReportedProgress) {
            final GraphRequest.b callback = this.request.getCallback();
            final long j10 = this.maxProgress;
            if (j10 <= 0 || !(callback instanceof GraphRequest.f)) {
                return;
            }
            final long j11 = this.progress;
            Handler handler = this.callbackHandler;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: q1.h0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e(callback, j11, j10);
                }
            }))) == null) {
                ((GraphRequest.f) callback).a(j11, j10);
            }
            this.lastReportedProgress = this.progress;
        }
    }
}
