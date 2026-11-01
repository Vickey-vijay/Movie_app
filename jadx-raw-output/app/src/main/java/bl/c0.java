package bl;

import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c0 {
    public static final <T extends Enum<T>> xk.b<T> a(String str, T[] tArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        ck.p.j(str, "serialName");
        ck.p.j(tArr, "values");
        ck.p.j(strArr, "names");
        ck.p.j(annotationArr, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                enumDescriptor.r(annotation);
            }
        }
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            String strName = (String) nj.n.R(strArr, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.l(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) nj.n.R(annotationArr, i11);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    enumDescriptor.q(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new EnumSerializer(str, tArr, enumDescriptor);
    }
}
