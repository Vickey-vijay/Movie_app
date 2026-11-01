package com.yandex.div.storage;

import androidx.annotation.UiThread;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;

/* JADX INFO: compiled from: RawJsonRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface RawJsonRepository {

    /* JADX INFO: compiled from: RawJsonRepository.kt */
    public static final class Payload {
        private final DivDataRepository.ActionOnError actionOnError;
        private final List<RawJson> jsons;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError) {
            this.jsons = list;
            this.actionOnError = actionOnError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return p.e(this.jsons, payload.jsons) && this.actionOnError == payload.actionOnError;
        }

        public int hashCode() {
            return (this.jsons.hashCode() * 31) + this.actionOnError.hashCode();
        }

        public String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }

        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        public final List<RawJson> getJsons() {
            return this.jsons;
        }

        public /* synthetic */ Payload(List list, DivDataRepository.ActionOnError actionOnError, int i10, i iVar) {
            this(list, (i10 & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }
    }

    @UiThread
    RawJsonRepositoryResult get(List<String> list);

    @UiThread
    RawJsonRepositoryResult put(Payload payload);

    @UiThread
    RawJsonRepositoryRemoveResult remove(l<? super RawJson, Boolean> lVar);
}
