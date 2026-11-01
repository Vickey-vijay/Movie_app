package com.digitalturbine.ignite.authenticator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j0.d;
import l0.h;
import org.json.JSONArray;
import org.json.JSONException;
import q0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f14003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14004b = false;

    public a(b bVar) {
        this.f14003a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            r0.b.a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra != null && (bVar = this.f14003a) != null) {
                d dVar = (d) bVar;
                try {
                    JSONArray jSONArray = new JSONArray(stringExtra);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        if ("DTID".equalsIgnoreCase(jSONArray.getString(i10))) {
                            r0.b.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                            if (dVar.f61686c.c()) {
                                r0.b.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                                h hVar = dVar.f61687d;
                                if (hVar != null) {
                                    r0.b.a("%s : one dt refresh required", "OneDTAuthenticator");
                                    hVar.f63388l.set(true);
                                }
                                dVar.f61686c.l();
                                return;
                            }
                            h hVar2 = dVar.f61687d;
                            if (hVar2 != null) {
                                hVar2.m();
                                return;
                            }
                            return;
                        }
                    }
                } catch (JSONException e10) {
                    n0.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_BROADCAST_ERROR, e10);
                }
            }
        }
    }
}
