package com.facebook.appevents;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import nj.b0;

/* JADX INFO: compiled from: PersistedEvents.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u0018B9\b\u0016\u0012.\u0010\u0019\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0013j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\u0014¢\u0006\u0004\b\u0017\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0004J\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0005J\u001c\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\fR<\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0013j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/PersistedEvents;", "Ljava/io/Serializable;", "", "writeReplace", "", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "keySet", "", "", "Lcom/facebook/appevents/AppEvent;", "entrySet", "accessTokenAppIdPair", "", "get", "", "containsKey", "appEvents", "Lmj/r;", "addEvents", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "events", "Ljava/util/HashMap;", "<init>", "()V", "appEventMap", "(Ljava/util/HashMap;)V", VastTagName.COMPANION, "a", "SerializationProxyV1", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class PersistedEvents implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    /* JADX INFO: compiled from: PersistedEvents.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R<\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1;", "Ljava/io/Serializable;", "", "readResolve", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "proxyEvents", "Ljava/util/HashMap;", "<init>", "(Ljava/util/HashMap;)V", VastTagName.COMPANION, "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
            ck.p.j(map, "proxyEvents");
            this.proxyEvents = map;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
        ck.p.j(map, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map2 = new HashMap<>();
        this.events = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            ck.p.j(accessTokenAppIdPair, "accessTokenAppIdPair");
            ck.p.j(list, "appEvents");
            if (!this.events.containsKey(accessTokenAppIdPair)) {
                this.events.put(accessTokenAppIdPair, b0.R0(list));
                return;
            }
            List<AppEvent> list2 = this.events.get(accessTokenAppIdPair);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            ck.p.j(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> setEntrySet = this.events.entrySet();
            ck.p.i(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ck.p.j(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> setKeySet = this.events.keySet();
            ck.p.i(setKeySet, "events.keys");
            return setKeySet;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
