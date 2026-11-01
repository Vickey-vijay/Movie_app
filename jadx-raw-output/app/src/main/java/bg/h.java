package bg;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.cache.CacheSpan;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    @Nullable
    public static h createCacheEntry(File file, long j10, e eVar) {
        return createCacheEntry(file, j10, -9223372036854775807L, eVar);
    }

    @Nullable
    public static h createCacheEntry(File file, long j10, long j11, e eVar) {
        File file2;
        String keyForId;
        String name = file.getName();
        if (name.endsWith(SUFFIX)) {
            file2 = file;
        } else {
            File fileUpgradeFile = upgradeFile(file, eVar);
            if (fileUpgradeFile == null) {
                return null;
            }
            file2 = fileUpgradeFile;
            name = fileUpgradeFile.getName();
        }
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches() || (keyForId = eVar.getKeyForId(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new h(keyForId, Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), length, j11 == -9223372036854775807L ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))) : j11, file2);
    }

    public static h createHole(String str, long j10, long j11) {
        return new h(str, j10, j11, -9223372036854775807L, null);
    }

    public static h createLookup(String str, long j10) {
        return new h(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File getCacheFile(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + SUFFIX);
    }

    public h copyWithFileAndLastTouchTimestamp(File file, long j10) {
        Assertions.checkState(this.isCached);
        return new h(this.key, this.position, this.length, j10, file);
    }

    private h(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    @Nullable
    private static File upgradeFile(File file, e eVar) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = Util.unescapeFileName((String) Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            if (matcher.matches()) {
                strUnescapeFileName = (String) Assertions.checkNotNull(matcher.group(1));
            } else {
                strUnescapeFileName = null;
            }
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File cacheFile = getCacheFile((File) Assertions.checkStateNotNull(file.getParentFile()), eVar.assignIdForKey(strUnescapeFileName), Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))));
        if (!file.renameTo(cacheFile)) {
            return null;
        }
        return cacheFile;
    }
}
