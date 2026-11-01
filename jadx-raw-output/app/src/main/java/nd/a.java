package nd;

import androidx.collection.ArrayMap;
import com.yandex.div.internal.Assert;
import java.util.List;
import java.util.Map;
import lk.a0;

/* JADX INFO: compiled from: Serialization.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final Map<String, String> a(String str) {
        if (str == null) {
            return kotlin.collections.a.j();
        }
        List listM0 = a0.M0(str, new char[]{0}, false, 0, 6, null);
        if (listM0.isEmpty()) {
            Assert.fail("Incorrect serialization: empty map should be serialized into null value!");
            return kotlin.collections.a.j();
        }
        ArrayMap arrayMap = new ArrayMap(listM0.size());
        int size = listM0.size();
        for (int i10 = 0; i10 < size; i10++) {
            List listM1 = a0.M0((CharSequence) listM0.get(i10), new char[]{'\t'}, false, 0, 6, null);
            if (listM1.size() == 1) {
                arrayMap.put(listM1.get(0), "");
            } else {
                arrayMap.put(listM1.get(0), listM1.get(1));
            }
        }
        return arrayMap;
    }

    public static final String b(Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb2.append(key);
            sb2.append('\t');
            sb2.append(value);
            sb2.append((char) 0);
        }
        return sb2.toString();
    }
}
