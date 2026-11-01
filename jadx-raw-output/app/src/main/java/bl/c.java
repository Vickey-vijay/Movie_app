package bl;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final Void a(String str, jk.c<?> cVar) {
        String str2;
        ck.p.j(cVar, "baseClass");
        String str3 = "in the scope of '" + cVar.i() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + cVar.i() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(jk.c<?> cVar, jk.c<?> cVar2) {
        ck.p.j(cVar, "subClass");
        ck.p.j(cVar2, "baseClass");
        String strI = cVar.i();
        if (strI == null) {
            strI = String.valueOf(cVar);
        }
        a(strI, cVar2);
        throw new KotlinNothingValueException();
    }
}
