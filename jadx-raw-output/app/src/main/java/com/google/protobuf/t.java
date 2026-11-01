package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements m0 {
    private static final y EMPTY_FACTORY = new a();
    private final y messageInfoFactory;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public class a implements y {
        @Override // com.google.protobuf.y
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.y
        public x messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class c implements y {
        private y[] factories;

        @Override // com.google.protobuf.y
        public boolean isSupported(Class<?> cls) {
            for (y yVar : this.factories) {
                if (yVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.y
        public x messageInfoFor(Class<?> cls) {
            for (y yVar : this.factories) {
                if (yVar.isSupported(cls)) {
                    return yVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public c(y... yVarArr) {
            this.factories = yVarArr;
        }
    }

    public t() {
        this(getDefaultMessageInfoFactory());
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private t(y yVar) {
        this.messageInfoFactory = (y) Internal.checkNotNull(yVar, "messageInfoFactory");
    }

    private static boolean allowExtensions(x xVar) {
        return b.$SwitchMap$com$google$protobuf$ProtoSyntax[xVar.getSyntax().ordinal()] != 1;
    }

    private static y getDefaultMessageInfoFactory() {
        return new c(n.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static y getDescriptorMessageInfoFactory() {
        try {
            return (y) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> l0<T> newSchema(Class<T> cls, x xVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return allowExtensions(xVar) ? a0.newSchema(cls, xVar, e0.lite(), r.lite(), n0.unknownFieldSetLiteSchema(), l.lite(), w.lite()) : a0.newSchema(cls, xVar, e0.lite(), r.lite(), n0.unknownFieldSetLiteSchema(), null, w.lite());
        }
        return allowExtensions(xVar) ? a0.newSchema(cls, xVar, e0.full(), r.full(), n0.unknownFieldSetFullSchema(), l.full(), w.full()) : a0.newSchema(cls, xVar, e0.full(), r.full(), n0.unknownFieldSetFullSchema(), null, w.full());
    }

    @Override // com.google.protobuf.m0
    public <T> l0<T> createSchema(Class<T> cls) {
        n0.requireGeneratedMessage(cls);
        x xVarMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (xVarMessageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                return b0.newSchema(n0.unknownFieldSetLiteSchema(), l.lite(), xVarMessageInfoFor.getDefaultInstance());
            }
            return b0.newSchema(n0.unknownFieldSetFullSchema(), l.full(), xVarMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, xVarMessageInfoFor);
    }
}
