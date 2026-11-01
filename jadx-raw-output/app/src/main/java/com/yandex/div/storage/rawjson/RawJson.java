package com.yandex.div.storage.rawjson;

import ck.p;
import org.json.JSONObject;

/* JADX INFO: compiled from: RawJson.kt */
/* JADX INFO: loaded from: classes.dex */
public interface RawJson {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: RawJson.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RawJson invoke(String str, JSONObject jSONObject) {
            return new Ready(str, jSONObject);
        }
    }

    /* JADX INFO: compiled from: RawJson.kt */
    public static final class Ready implements RawJson {
        private final JSONObject data;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f45871id;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return p.e(this.f45871id, ready.f45871id) && p.e(this.data, ready.data);
        }

        public int hashCode() {
            return (this.f45871id.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Ready(id=" + this.f45871id + ", data=" + this.data + ')';
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public JSONObject getData() {
            return this.data;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public String getId() {
            return this.f45871id;
        }

        public Ready(String str, JSONObject jSONObject) {
            this.f45871id = str;
            this.data = jSONObject;
        }
    }

    JSONObject getData();

    String getId();
}
