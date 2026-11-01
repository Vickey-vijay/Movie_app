package q1;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProgressNoopOutputStream.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lq1/d0;", "Ljava/io/OutputStream;", "Lq1/g0;", "Lcom/facebook/GraphRequest;", "currentRequest", "Lmj/r;", "a", "", "Lq1/i0;", CampaignEx.JSON_KEY_AD_K, "", "size", InneractiveMediationDefs.GENDER_FEMALE, "", "buffer", "write", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "oneByte", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "callbackHandler", "", "c", "Ljava/util/Map;", "progressMap", "d", "Lcom/facebook/GraphRequest;", "e", "Lq1/i0;", "currentRequestProgress", "<set-?>", "I", "h", "()I", "maxProgress", "<init>", "(Landroid/os/Handler;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class d0 extends OutputStream implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Handler callbackHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Map<GraphRequest, i0> progressMap = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public GraphRequest currentRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public i0 currentRequestProgress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int maxProgress;

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        ck.p.j(bArr, "buffer");
        f(bArr.length);
    }

    @Override // q1.g0
    public void a(GraphRequest graphRequest) {
        this.currentRequest = graphRequest;
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    public final void f(long j10) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest == null) {
            return;
        }
        if (this.currentRequestProgress == null) {
            i0 i0Var = new i0(this.callbackHandler, graphRequest);
            this.currentRequestProgress = i0Var;
            this.progressMap.put(graphRequest, i0Var);
        }
        i0 i0Var2 = this.currentRequestProgress;
        if (i0Var2 != null) {
            i0Var2.c(j10);
        }
        this.maxProgress += (int) j10;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxProgress() {
        return this.maxProgress;
    }

    public final Map<GraphRequest, i0> k() {
        return this.progressMap;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        ck.p.j(bArr, "buffer");
        f(i11);
    }

    public d0(Handler handler) {
        this.callbackHandler = handler;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        f(1L);
    }
}
