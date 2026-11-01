package io.bidmachine.utils;

import bk.l;
import ck.p;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.ironsource.C3426d4;
import io.bidmachine.util.UtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProtoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000\u001a.\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0011H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0005H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0013H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\fH\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0010H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0001H\u0000¨\u0006\u0014"}, d2 = {"encodeToStringBase64Safely", "", "Lcom/explorestack/protobuf/MessageLite;", "Lcom/explorestack/protobuf/MessageLite$Builder;", "mapNotNullToProtoListValue", "Lcom/explorestack/protobuf/ListValue;", "T", "", "transform", "Lkotlin/Function1;", "Lcom/explorestack/protobuf/Value;", "putField", "Lcom/explorestack/protobuf/Struct$Builder;", C3426d4.i.W, "value", "Lcom/explorestack/protobuf/Struct;", "", "", "toProtoValue", "Lcom/explorestack/protobuf/ListValue$Builder;", "bidmachine-android-sdk_bi_3_3_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ProtoUtilsKt {
    public static final String encodeToStringBase64Safely(MessageLite messageLite) {
        p.j(messageLite, "<this>");
        try {
            byte[] byteArray = messageLite.toByteArray();
            p.i(byteArray, "toByteArray()");
            return UtilsKt.encodeToStringBase64$default(byteArray, 0, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Struct.Builder putField(Struct.Builder builder, String str, String str2) {
        p.j(builder, "<this>");
        p.j(str, C3426d4.i.W);
        p.j(str2, "value");
        builder.putFields(str, toProtoValue(str2));
        return builder;
    }

    public static final Value toProtoValue(String str) {
        p.j(str, "<this>");
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        p.i(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final String encodeToStringBase64Safely(MessageLite.Builder builder) {
        p.j(builder, "<this>");
        try {
            MessageLite messageLiteBuild = builder.build();
            p.i(messageLiteBuild, "build()");
            return encodeToStringBase64Safely(messageLiteBuild);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> ListValue mapNotNullToProtoListValue(List<? extends T> list, l<? super T, Value> lVar) {
        p.j(list, "<this>");
        p.j(lVar, "transform");
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Value valueInvoke = lVar.invoke(it.next());
            if (valueInvoke != null) {
                builderNewBuilder.addValues(valueInvoke);
            }
        }
        ListValue listValueBuild = builderNewBuilder.build();
        p.i(listValueBuild, "listValueBuilder.build()");
        return listValueBuild;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String str, boolean z10) {
        p.j(builder, "<this>");
        p.j(str, C3426d4.i.W);
        builder.putFields(str, toProtoValue(z10));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String str, Number number) {
        p.j(builder, "<this>");
        p.j(str, C3426d4.i.W);
        p.j(number, "value");
        builder.putFields(str, toProtoValue(number));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String str, Struct struct) {
        p.j(builder, "<this>");
        p.j(str, C3426d4.i.W);
        p.j(struct, "value");
        builder.putFields(str, toProtoValue(struct));
        return builder;
    }

    public static final Value toProtoValue(boolean z10) {
        Value valueBuild = Value.newBuilder().setBoolValue(z10).build();
        p.i(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String str, ListValue listValue) {
        p.j(builder, "<this>");
        p.j(str, C3426d4.i.W);
        p.j(listValue, "value");
        builder.putFields(str, toProtoValue(listValue));
        return builder;
    }

    public static final Value toProtoValue(Number number) {
        p.j(number, "<this>");
        Value.Builder builderNewBuilder = Value.newBuilder();
        Double doubleOrDefault$default = UtilsKt.toDoubleOrDefault$default(number, null, 1, null);
        Value valueBuild = builderNewBuilder.setNumberValue(doubleOrDefault$default != null ? doubleOrDefault$default.doubleValue() : number.doubleValue()).build();
        p.i(valueBuild, "newBuilder()\n        .se…ouble())\n        .build()");
        return valueBuild;
    }

    public static final Value toProtoValue(Struct struct) {
        p.j(struct, "<this>");
        Value valueBuild = Value.newBuilder().setStructValue(struct).build();
        p.i(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Value toProtoValue(Struct.Builder builder) {
        p.j(builder, "<this>");
        Struct structBuild = builder.build();
        p.i(structBuild, "build()");
        return toProtoValue(structBuild);
    }

    public static final Value toProtoValue(ListValue listValue) {
        p.j(listValue, "<this>");
        Value valueBuild = Value.newBuilder().setListValue(listValue).build();
        p.i(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Value toProtoValue(ListValue.Builder builder) {
        p.j(builder, "<this>");
        ListValue listValueBuild = builder.build();
        p.i(listValueBuild, "build()");
        return toProtoValue(listValueBuild);
    }
}
