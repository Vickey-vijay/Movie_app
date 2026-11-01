package q1;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProgressOutputStream.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR$\u0010%\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0018\u0010)\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(¨\u0006."}, d2 = {"Lq1/f0;", "Ljava/io/FilterOutputStream;", "Lq1/g0;", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "Lmj/r;", "a", "", "buffer", "write", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "oneByte", "close", "", "size", InneractiveMediationDefs.GENDER_FEMALE, "l", "Lq1/y;", "b", "Lq1/y;", "requests", "", "Lq1/i0;", "c", "Ljava/util/Map;", "progressMap", "d", "J", CampaignEx.JSON_KEY_AD_K, "()J", "maxProgress", "e", "threshold", "<set-?>", "h", "batchProgress", "g", "lastReportedProgress", "Lq1/i0;", "currentRequestProgress", "Ljava/io/OutputStream;", "out", "<init>", "(Ljava/io/OutputStream;Lq1/y;Ljava/util/Map;J)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class f0 extends FilterOutputStream implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final y requests;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Map<GraphRequest, i0> progressMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long maxProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long threshold;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long batchProgress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long lastReportedProgress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public i0 currentRequestProgress;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        ck.p.j(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        f(bArr.length);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(OutputStream outputStream, y yVar, Map<GraphRequest, i0> map, long j10) {
        super(outputStream);
        ck.p.j(outputStream, "out");
        ck.p.j(yVar, "requests");
        ck.p.j(map, "progressMap");
        this.requests = yVar;
        this.progressMap = map;
        this.maxProgress = j10;
        this.threshold = t.A();
    }

    public static final void m(y.a aVar, f0 f0Var) {
        ck.p.j(aVar, "$callback");
        ck.p.j(f0Var, "this$0");
        ((y.c) aVar).a(f0Var.requests, f0Var.getBatchProgress(), f0Var.getMaxProgress());
    }

    @Override // q1.g0
    public void a(GraphRequest graphRequest) {
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    public final void f(long j10) {
        i0 i0Var = this.currentRequestProgress;
        if (i0Var != null) {
            i0Var.b(j10);
        }
        long j11 = this.batchProgress + j10;
        this.batchProgress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            l();
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getBatchProgress() {
        return this.batchProgress;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public final void l() {
        if (this.batchProgress > this.lastReportedProgress) {
            for (final y.a aVar : this.requests.p()) {
                if (aVar instanceof y.c) {
                    Handler handlerO = this.requests.getCallbackHandler();
                    if ((handlerO == null ? null : Boolean.valueOf(handlerO.post(new Runnable() { // from class: q1.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            f0.m(aVar, this);
                        }
                    }))) == null) {
                        ((y.c) aVar).a(this.requests, this.batchProgress, this.maxProgress);
                    }
                }
            }
            this.lastReportedProgress = this.batchProgress;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<i0> it = this.progressMap.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        l();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ck.p.j(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        f(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        f(1L);
    }
}
