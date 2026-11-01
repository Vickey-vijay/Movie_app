package com.yandex.div.storage;

import ck.i;
import com.yandex.div.storage.database.StorageException;

/* JADX INFO: compiled from: DivStorageErrorException.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivStorageErrorException extends StorageException {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: DivStorageErrorException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        public final String getMessage(String str, String str2) {
            String str3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (str2 != null) {
                str3 = " Card id: " + str2;
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = "";
            }
            sb2.append(str3);
            return sb2.toString();
        }
    }

    public DivStorageErrorException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th2, String str2, int i10, i iVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2);
    }

    public DivStorageErrorException(String str, Throwable th2, String str2) {
        super(Companion.getMessage(str, str2), th2, str2);
    }
}
