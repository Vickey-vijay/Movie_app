package com.facebook.internal;

import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: CallbackManagerImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0003\u000b\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl;", "Lq1/h;", "", "requestCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "", "onActivityResult", "", "Lcom/facebook/internal/CallbackManagerImpl$a;", "a", "Ljava/util/Map;", "callbacks", "<init>", "()V", "b", "RequestCodeOffset", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CallbackManagerImpl implements q1.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Integer, a> f14311c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, a> callbacks = new HashMap();

    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "(Ljava/lang/String;II)V", "toRequestCode", "Login", "Share", "Message", "Like", "GameRequest", "AppGroupCreate", "AppGroupJoin", "AppInvite", "DeviceShare", "GamingFriendFinder", "GamingGroupIntegration", "Referral", "GamingContextCreate", "GamingContextSwitch", "GamingContextChoose", "TournamentShareDialog", "TournamentJoinDialog", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static RequestCodeOffset[] valuesCustom() {
            RequestCodeOffset[] requestCodeOffsetArrValuesCustom = values();
            return (RequestCodeOffset[]) Arrays.copyOf(requestCodeOffsetArrValuesCustom, requestCodeOffsetArrValuesCustom.length);
        }

        RequestCodeOffset(int i10) {
            this.offset = i10;
        }

        public final int toRequestCode() {
            return q1.t.q() + this.offset;
        }
    }

    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$a;", "", "", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        boolean a(int resultCode, Intent data);
    }

    /* JADX INFO: renamed from: com.facebook.internal.CallbackManagerImpl$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$b;", "", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl$a;", "b", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "", "c", "", "staticCallbacks", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized a b(int requestCode) {
            return (a) CallbackManagerImpl.f14311c.get(Integer.valueOf(requestCode));
        }

        public final boolean c(int requestCode, int resultCode, Intent data) {
            a aVarB = b(requestCode);
            if (aVarB == null) {
                return false;
            }
            return aVarB.a(resultCode, data);
        }
    }

    @Override // q1.h
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        a aVar = this.callbacks.get(Integer.valueOf(requestCode));
        return aVar == null ? INSTANCE.c(requestCode, resultCode, data) : aVar.a(resultCode, data);
    }
}
