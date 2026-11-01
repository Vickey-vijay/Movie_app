package com.yandex.div.core.view2.errors;

import ck.i;
import ck.p;
import com.yandex.div.R$drawable;

/* JADX INFO: compiled from: ErrorViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorViewModel {
    private final int errorCount;
    private final String errorDetails;
    private final boolean showDetails;
    private final int warningCount;
    private final String warningDetails;

    public ErrorViewModel() {
        this(false, 0, 0, null, null, 31, null);
    }

    public ErrorViewModel(boolean z10, int i10, int i11, String str, String str2) {
        this.showDetails = z10;
        this.errorCount = i10;
        this.warningCount = i11;
        this.errorDetails = str;
        this.warningDetails = str2;
    }

    public static /* synthetic */ ErrorViewModel copy$default(ErrorViewModel errorViewModel, boolean z10, int i10, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = errorViewModel.showDetails;
        }
        if ((i12 & 2) != 0) {
            i10 = errorViewModel.errorCount;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = errorViewModel.warningCount;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            str = errorViewModel.errorDetails;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            str2 = errorViewModel.warningDetails;
        }
        return errorViewModel.copy(z10, i13, i14, str3, str2);
    }

    public final ErrorViewModel copy(boolean z10, int i10, int i11, String str, String str2) {
        return new ErrorViewModel(z10, i10, i11, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        return this.showDetails == errorViewModel.showDetails && this.errorCount == errorViewModel.errorCount && this.warningCount == errorViewModel.warningCount && p.e(this.errorDetails, errorViewModel.errorDetails) && p.e(this.warningDetails, errorViewModel.warningDetails);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.showDetails;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (((((((r10 * 31) + Integer.hashCode(this.errorCount)) * 31) + Integer.hashCode(this.warningCount)) * 31) + this.errorDetails.hashCode()) * 31) + this.warningDetails.hashCode();
    }

    public String toString() {
        return "ErrorViewModel(showDetails=" + this.showDetails + ", errorCount=" + this.errorCount + ", warningCount=" + this.warningCount + ", errorDetails=" + this.errorDetails + ", warningDetails=" + this.warningDetails + ')';
    }

    public final int getCounterBackground() {
        int i10 = this.warningCount;
        if (i10 > 0 && this.errorCount > 0) {
            return R$drawable.warning_error_counter_background;
        }
        if (i10 == 0 && this.errorCount == 0) {
            return R$drawable.neutral_counter_background;
        }
        return i10 > 0 ? R$drawable.warning_counter_background : R$drawable.error_counter_background;
    }

    public final String getCounterText() {
        int i10 = this.errorCount;
        if (i10 <= 0 || this.warningCount <= 0) {
            int i11 = this.warningCount;
            if (i11 > 0) {
                return String.valueOf(i11);
            }
            return i10 > 0 ? String.valueOf(i10) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.errorCount);
        sb2.append('/');
        sb2.append(this.warningCount);
        return sb2.toString();
    }

    public final String getDetails() {
        if (this.errorCount <= 0 || this.warningCount <= 0) {
            return this.warningCount > 0 ? this.warningDetails : this.errorDetails;
        }
        return this.errorDetails + "\n\n" + this.warningDetails;
    }

    public final boolean getShowDetails() {
        return this.showDetails;
    }

    public /* synthetic */ ErrorViewModel(boolean z10, int i10, int i11, String str, String str2, int i12, i iVar) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) == 0 ? i11 : 0, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? "" : str2);
    }
}
