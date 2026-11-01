package com.yandex.div.storage;

import androidx.annotation.AnyThread;
import bk.l;
import ck.p;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: DivStorage.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface DivStorage {

    /* JADX INFO: compiled from: DivStorage.kt */
    public static class LoadDataResult<T> {
        private final List<StorageException> errors;
        private final List<T> restoredData;

        public final List<T> component1() {
            return getRestoredData();
        }

        public final List<StorageException> component2() {
            return getErrors();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadDataResult)) {
                return false;
            }
            LoadDataResult loadDataResult = (LoadDataResult) obj;
            return p.e(getRestoredData(), loadDataResult.getRestoredData()) && p.e(getErrors(), loadDataResult.getErrors());
        }

        public int hashCode() {
            return (getRestoredData().hashCode() * 31) + getErrors().hashCode();
        }

        public String toString() {
            return "LoadDataResult(restoredData=" + getRestoredData() + ", errors=" + getErrors() + ')';
        }

        public List<StorageException> getErrors() {
            return this.errors;
        }

        public List<T> getRestoredData() {
            return this.restoredData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LoadDataResult(List<? extends T> list, List<? extends StorageException> list2) {
            this.restoredData = list;
            this.errors = list2;
        }
    }

    @AnyThread
    LoadDataResult<RawJson> readRawJsons(Set<String> set);

    @AnyThread
    RemoveResult removeRawJsons(l<? super RawJson, Boolean> lVar);

    @AnyThread
    ExecutionResult saveRawJsons(List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError);

    /* JADX INFO: compiled from: DivStorage.kt */
    public static final class RemoveResult {
        private final List<StorageException> errors;
        private final Set<String> ids;

        public final Set<String> component1() {
            return this.ids;
        }

        public final List<StorageException> component2() {
            return this.errors;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveResult)) {
                return false;
            }
            RemoveResult removeResult = (RemoveResult) obj;
            return p.e(this.ids, removeResult.ids) && p.e(this.errors, removeResult.errors);
        }

        public int hashCode() {
            return (this.ids.hashCode() * 31) + this.errors.hashCode();
        }

        public String toString() {
            return "RemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveResult(Set<String> set, List<? extends StorageException> list) {
            this.ids = set;
            this.errors = list;
        }
    }
}
