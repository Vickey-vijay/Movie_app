package q1;

import android.content.Intent;
import com.ironsource.C3426d4;
import kotlin.Metadata;

/* JADX INFO: compiled from: CallbackManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lq1/h;", "", "", "requestCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "", "onActivityResult", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public interface h {
    boolean onActivityResult(int requestCode, int resultCode, Intent data);

    /* JADX INFO: renamed from: q1.h$a, reason: from toString */
    /* JADX INFO: compiled from: CallbackManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lq1/h$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getRequestCode", "()I", "requestCode", "b", "getResultCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "c", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "data", "<init>", "(IILandroid/content/Intent;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ActivityResultParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final int requestCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final int resultCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final Intent data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivityResultParameters)) {
                return false;
            }
            ActivityResultParameters activityResultParameters = (ActivityResultParameters) other;
            return this.requestCode == activityResultParameters.requestCode && this.resultCode == activityResultParameters.resultCode && ck.p.e(this.data, activityResultParameters.data);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.requestCode) * 31) + Integer.hashCode(this.resultCode)) * 31;
            Intent intent = this.data;
            return iHashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }

        public ActivityResultParameters(int i10, int i11, Intent intent) {
            this.requestCode = i10;
            this.resultCode = i11;
            this.data = intent;
        }
    }
}
