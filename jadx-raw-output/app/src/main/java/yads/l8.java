package yads;

import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class l8 {
    public static String a(AdQualityVerificationState adQualityVerificationState) {
        if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
            ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason();
            throw null;
        }
        if (adQualityVerificationState instanceof AdQualityVerificationState.Error) {
            ((AdQualityVerificationState.Error) adQualityVerificationState).getError();
            throw null;
        }
        if (!(adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay)) {
            throw new NoWhenBranchMatchedException();
        }
        ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason();
        throw null;
    }

    public static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified)) {
            if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
                return a(((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue());
            }
            throw new NoWhenBranchMatchedException();
        }
        ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason();
        throw null;
    }
}
