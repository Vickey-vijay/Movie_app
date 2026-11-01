package com.vungle.ads.internal.persistence;

import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: FilePreferences.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B#\b\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eJ*\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0011J6\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences;", "", "Lmj/r;", "apply", "", C3426d4.i.W, "", "value", "put", "defaultValue", "getBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "remove", "getString", "", "getInt", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getStringSet", "", "getLong", "Ljava/util/concurrent/Executor;", "ioExecutor", "Ljava/util/concurrent/Executor;", "Ljava/io/File;", C3426d4.i.f28530b, "Ljava/io/File;", "Ljava/util/concurrent/ConcurrentHashMap;", "values", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "filename", "<init>", "(Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Ljava/lang/String;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FilePreferences {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, FilePreferences> filePreferenceMap = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: FilePreferences.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences$Companion;", "", "()V", "FILENAME", "", "getFILENAME$annotations", "TPAT_FAILED_FILENAME", "filePreferenceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "get", "ioExecutor", "Ljava/util/concurrent/Executor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "filename", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getFILENAME$annotations() {
        }

        public final synchronized FilePreferences get(Executor ioExecutor, PathProvider pathProvider, String filename) {
            Object filePreferences;
            Object objPutIfAbsent;
            p.j(ioExecutor, "ioExecutor");
            p.j(pathProvider, "pathProvider");
            p.j(filename, "filename");
            ConcurrentHashMap concurrentHashMap = FilePreferences.filePreferenceMap;
            filePreferences = concurrentHashMap.get(filename);
            if (filePreferences == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (filePreferences = new FilePreferences(ioExecutor, pathProvider, filename, null)))) != null) {
                filePreferences = objPutIfAbsent;
            }
            p.i(filePreferences, "filePreferenceMap.getOrP…, filename)\n            }");
            return (FilePreferences) filePreferences;
        }

        public static /* synthetic */ FilePreferences get$default(Companion companion, Executor executor, PathProvider pathProvider, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = FilePreferences.FILENAME;
            }
            return companion.get(executor, pathProvider, str);
        }
    }

    private FilePreferences(Executor executor, PathProvider pathProvider, String str) {
        this.ioExecutor = executor;
        File file = new File(pathProvider.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = FileUtility.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, i iVar) {
        this(executor, pathProvider, str);
    }

    public static final synchronized FilePreferences get(Executor executor, PathProvider pathProvider, String str) {
        return INSTANCE.get(executor, pathProvider, str);
    }

    public final boolean getBoolean(String key, boolean defaultValue) {
        p.j(key, C3426d4.i.W);
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    public final String getString(String key, String defaultValue) {
        p.j(key, C3426d4.i.W);
        p.j(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final FilePreferences put(String key, boolean value) {
        p.j(key, C3426d4.i.W);
        this.values.put(key, Boolean.valueOf(value));
        return this;
    }

    public final void apply() {
        final HashMap map = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: cd.a
            @Override // java.lang.Runnable
            public final void run() {
                FilePreferences.m3252apply$lambda0(this.f5808b, map);
            }
        });
    }

    public final int getInt(String key, int defaultValue) {
        p.j(key, C3426d4.i.W);
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : defaultValue;
    }

    public final long getLong(String key, long defaultValue) {
        p.j(key, C3426d4.i.W);
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        p.j(key, C3426d4.i.W);
        p.j(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj) : defaultValue;
    }

    public final FilePreferences put(String key, String value) {
        p.j(key, C3426d4.i.W);
        p.j(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final FilePreferences remove(String key) {
        p.j(key, C3426d4.i.W);
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m3252apply$lambda0(FilePreferences filePreferences, Serializable serializable) {
        p.j(filePreferences, "this$0");
        p.j(serializable, "$serializable");
        FileUtility.writeSerializable(filePreferences.file, serializable);
    }

    public final Boolean getBoolean(String key) {
        p.j(key, C3426d4.i.W);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        p.j(key, C3426d4.i.W);
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final FilePreferences put(String key, int value) {
        p.j(key, C3426d4.i.W);
        this.values.put(key, Integer.valueOf(value));
        return this;
    }

    public final FilePreferences put(String key, HashSet<String> value) {
        p.j(key, C3426d4.i.W);
        this.values.put(key, CollectionsConcurrencyUtil.getNewHashSet(value));
        return this;
    }

    public final FilePreferences put(String key, long value) {
        p.j(key, C3426d4.i.W);
        this.values.put(key, Long.valueOf(value));
        return this;
    }

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, int i10, i iVar) {
        this(executor, pathProvider, (i10 & 4) != 0 ? FILENAME : str);
    }
}
