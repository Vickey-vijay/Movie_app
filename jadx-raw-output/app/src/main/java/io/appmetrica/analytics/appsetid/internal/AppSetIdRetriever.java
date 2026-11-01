package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lmj/r;", "retrieveAppSetId", "<init>", "()V", "appsetid_release"}, k = 1, mv = {1, 6, 0})
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f54423a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f54424b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i10) {
        appSetIdRetriever.getClass();
        if (i10 != 1) {
            if (i10 != 2) {
                return AppSetIdScope.UNKNOWN;
            }
            return AppSetIdScope.DEVELOPER;
        }
        return AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) throws Throwable {
        Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
        OnCompleteListener<AppSetIdInfo> onCompleteListener = new OnCompleteListener<AppSetIdInfo>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<AppSetIdInfo> task) {
                Object obj = this.f54425a.f54423a;
                AppSetIdRetriever appSetIdRetriever = this.f54425a;
                synchronized (obj) {
                    appSetIdRetriever.f54424b.remove(this);
                }
                if (task.isSuccessful()) {
                    appSetIdListener.onAppSetIdRetrieved(task.getResult().getId(), AppSetIdRetriever.access$convertScope(this.f54425a, task.getResult().getScope()));
                } else {
                    appSetIdListener.onFailure(task.getException());
                }
            }
        };
        synchronized (this.f54423a) {
            this.f54424b.add(onCompleteListener);
        }
        appSetIdInfo.addOnCompleteListener(onCompleteListener);
    }
}
