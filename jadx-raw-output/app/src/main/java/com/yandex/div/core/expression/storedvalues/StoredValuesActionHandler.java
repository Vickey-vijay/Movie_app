package com.yandex.div.core.expression.storedvalues;

import android.net.Uri;
import ck.p;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import lk.a0;
import lk.w;

/* JADX INFO: compiled from: StoredValuesActionHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class StoredValuesActionHandler {
    public static final StoredValuesActionHandler INSTANCE = new StoredValuesActionHandler();

    /* JADX INFO: compiled from: StoredValuesActionHandler.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private StoredValuesActionHandler() {
    }

    public static final boolean canHandle(String str) {
        return p.e(str, "set_stored_value");
    }

    private final StoredValue createStoredValue(StoredValue.Type type, String str, String str2) throws StoredValueDeclarationException {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, str2);
            case 2:
                return new StoredValue.IntegerStoredValue(str, parseAsLong(str2));
            case 3:
                return new StoredValue.BooleanStoredValue(str, parseAsBoolean(str2));
            case 4:
                return new StoredValue.DoubleStoredValue(str, parseAsDouble(str2));
            case 5:
                return new StoredValue.ColorStoredValue(str, m3303parseAsColorC4zCDoM(str2), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, m3304parseAsUrlVcSV9u8(str2), null);
            default:
                throw new StoredValueDeclarationException("Cannot create stored value of type = '" + type + "'.", null, 2, null);
        }
    }

    public static final boolean handleAction(Uri uri, DivViewFacade divViewFacade) {
        String param;
        String param2;
        Long lT;
        StoredValue.Type typeFromString;
        Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
        if (div2View == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Handler view is not instance of Div2View");
            }
            return false;
        }
        StoredValuesActionHandler storedValuesActionHandler = INSTANCE;
        String param3 = storedValuesActionHandler.getParam(uri, "name");
        if (param3 != null && (param = storedValuesActionHandler.getParam(uri, "value")) != null && (param2 = storedValuesActionHandler.getParam(uri, "lifetime")) != null && (lT = w.t(param2)) != null) {
            long jLongValue = lT.longValue();
            String param4 = storedValuesActionHandler.getParam(uri, "type");
            if (param4 != null && (typeFromString = StoredValue.Type.Converter.fromString(param4)) != null) {
                try {
                    return storedValuesActionHandler.executeAction(storedValuesActionHandler.createStoredValue(typeFromString, param3, param), jLongValue, div2View);
                } catch (StoredValueDeclarationException e10) {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Stored value '" + param3 + "' declaration failed: " + e10.getMessage());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private final int m3303parseAsColorC4zCDoM(String str) throws StoredValueDeclarationException {
        Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (numInvoke != null) {
            return Color.m3369constructorimpl(numInvoke.intValue());
        }
        throw new StoredValueDeclarationException("Wrong value format for color stored value: '" + str + '\'', null, 2, null);
    }

    /* JADX INFO: renamed from: parseAsUrl-VcSV9u8, reason: not valid java name */
    private final String m3304parseAsUrlVcSV9u8(String str) throws StoredValueDeclarationException {
        try {
            return Url.Companion.m3386fromVcSV9u8(str);
        } catch (IllegalArgumentException e10) {
            throw new StoredValueDeclarationException(null, e10, 1, null);
        }
    }

    private final String getParam(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("The required parameter " + str + " is missing");
            }
            return null;
        }
        return queryParameter;
    }

    private final boolean parseAsBoolean(String str) throws StoredValueDeclarationException {
        Boolean boolJ1 = a0.j1(str);
        if (boolJ1 != null || (boolJ1 = ConvertUtilsKt.toBoolean(parseAsInt(str))) != null) {
            return boolJ1.booleanValue();
        }
        throw new StoredValueDeclarationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    private final double parseAsDouble(String str) throws StoredValueDeclarationException {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e10) {
            throw new StoredValueDeclarationException(null, e10, 1, null);
        }
    }

    private final int parseAsInt(String str) throws StoredValueDeclarationException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw new StoredValueDeclarationException(null, e10, 1, null);
        }
    }

    private final long parseAsLong(String str) throws StoredValueDeclarationException {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            throw new StoredValueDeclarationException(null, e10, 1, null);
        }
    }

    public final boolean executeAction(StoredValue storedValue, long j10, Div2View div2View) {
        return div2View.getDiv2Component$div_release().getStoredValuesController().setStoredValue(storedValue, j10, div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDivTag(), div2View.getDivData()));
    }
}
