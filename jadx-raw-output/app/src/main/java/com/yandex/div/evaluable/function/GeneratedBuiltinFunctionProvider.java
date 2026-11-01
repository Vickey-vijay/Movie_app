package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import java.util.List;

/* JADX INFO: compiled from: GeneratedBuiltinFunctionProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GeneratedBuiltinFunctionProvider implements FunctionProvider {
    public static final GeneratedBuiltinFunctionProvider INSTANCE = new GeneratedBuiltinFunctionProvider();

    private GeneratedBuiltinFunctionProvider() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function get(String str, List<? extends EvaluableType> list) throws Exception {
        p.j(str, "name");
        p.j(list, "args");
        switch (str.hashCode()) {
            case -2129095909:
                if (str.equals("getArrayInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayInteger.INSTANCE, list);
                }
                break;
            case -2096254100:
                if (str.equals("getArrayFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayFromArray.INSTANCE, list);
                }
                break;
            case -2015731347:
                if (str.equals("formatDateAsUTCWithLocale")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsUTCWithLocale.INSTANCE, list);
                }
                break;
            case -1930505522:
                if (str.equals("getOptIntegerFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptIntegerFromArray.INSTANCE, list);
                }
                break;
            case -1919300188:
                if (str.equals("toNumber")) {
                    IntegerToNumber integerToNumber = IntegerToNumber.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable = integerToNumber.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok2 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable, ok2)) {
                        return integerToNumber;
                    }
                    StringToNumber stringToNumber = StringToNumber.INSTANCE;
                    if (p.e(stringToNumber.matchesArguments$div_evaluable(list), ok2)) {
                        return stringToNumber;
                    }
                    if (p.e(integerToNumber.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return integerToNumber;
                    }
                    if (p.e(stringToNumber.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return stringToNumber;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -1857218874:
                if (str.equals("getIntervalTotalHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalHours.INSTANCE, list);
                }
                break;
            case -1843679562:
                if (str.equals("getIntervalTotalWeeks")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalWeeks.INSTANCE, list);
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    ArrayToString arrayToString = ArrayToString.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable2 = arrayToString.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok3 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable2, ok3)) {
                        return arrayToString;
                    }
                    BooleanToString booleanToString = BooleanToString.INSTANCE;
                    if (p.e(booleanToString.matchesArguments$div_evaluable(list), ok3)) {
                        return booleanToString;
                    }
                    ColorToString colorToString = ColorToString.INSTANCE;
                    if (p.e(colorToString.matchesArguments$div_evaluable(list), ok3)) {
                        return colorToString;
                    }
                    DictToString dictToString = DictToString.INSTANCE;
                    if (p.e(dictToString.matchesArguments$div_evaluable(list), ok3)) {
                        return dictToString;
                    }
                    IntegerToString integerToString = IntegerToString.INSTANCE;
                    if (p.e(integerToString.matchesArguments$div_evaluable(list), ok3)) {
                        return integerToString;
                    }
                    NumberToString numberToString = NumberToString.INSTANCE;
                    if (p.e(numberToString.matchesArguments$div_evaluable(list), ok3)) {
                        return numberToString;
                    }
                    StringToString stringToString = StringToString.INSTANCE;
                    if (p.e(stringToString.matchesArguments$div_evaluable(list), ok3)) {
                        return stringToString;
                    }
                    UrlToString urlToString = UrlToString.INSTANCE;
                    if (p.e(urlToString.matchesArguments$div_evaluable(list), ok3)) {
                        return urlToString;
                    }
                    if (p.e(arrayToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return arrayToString;
                    }
                    if (p.e(booleanToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return booleanToString;
                    }
                    if (p.e(colorToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return colorToString;
                    }
                    if (p.e(dictToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return dictToString;
                    }
                    if (p.e(integerToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return integerToString;
                    }
                    if (p.e(numberToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return numberToString;
                    }
                    if (p.e(stringToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return stringToString;
                    }
                    if (p.e(urlToString.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return urlToString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -1730341801:
                if (str.equals("getDictOptInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptInteger.INSTANCE, list);
                }
                break;
            case -1603949422:
                if (str.equals("getBooleanFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanFromDict.INSTANCE, list);
                }
                break;
            case -1601021533:
                if (str.equals("getDictUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictUrl.INSTANCE, list);
                }
                break;
            case -1598503635:
                if (str.equals("toBoolean")) {
                    IntegerToBoolean integerToBoolean = IntegerToBoolean.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable3 = integerToBoolean.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok4 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable3, ok4)) {
                        return integerToBoolean;
                    }
                    StringToBoolean stringToBoolean = StringToBoolean.INSTANCE;
                    if (p.e(stringToBoolean.matchesArguments$div_evaluable(list), ok4)) {
                        return stringToBoolean;
                    }
                    if (p.e(integerToBoolean.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                        return integerToBoolean;
                    }
                    if (p.e(stringToBoolean.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                        return stringToBoolean;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -1586214751:
                if (str.equals("getOptIntegerFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptIntegerFromDict.INSTANCE, list);
                }
                break;
            case -1544450268:
                if (str.equals("getOptBooleanFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptBooleanFromArray.INSTANCE, list);
                }
                break;
            case -1536224128:
                if (str.equals("getArrayColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayColor.INSTANCE, list);
                }
                break;
            case -1506310026:
                if (str.equals("getIntervalTotalSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalSeconds.INSTANCE, list);
                }
                break;
            case -1436100668:
                if (str.equals("getIntervalSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalSeconds.INSTANCE, list);
                }
                break;
            case -1288010167:
                if (str.equals("getSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetSeconds.INSTANCE, list);
                }
                break;
            case -1249364890:
                if (str.equals("getDay")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDay.INSTANCE, list);
                }
                break;
            case -1233067443:
                if (str.equals("replaceAll")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringReplaceAll.INSTANCE, list);
                }
                break;
            case -1223509624:
                if (str.equals("getStringFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringFromArray.INSTANCE, list);
                }
                break;
            case -1192573227:
                if (str.equals("testRegex")) {
                    return FunctionValidatorKt.withArgumentsValidation(TestRegex.INSTANCE, list);
                }
                break;
            case -1180629592:
                if (str.equals("toColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringToColor.INSTANCE, list);
                }
                break;
            case -1168421440:
                if (str.equals("getIntervalTotalDays")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalDays.INSTANCE, list);
                }
                break;
            case -1162978502:
                if (str.equals("maxInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(IntegerMaxValue.INSTANCE, list);
                }
                break;
            case -1148047119:
                if (str.equals("parseUnixTimeAsLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(ParseUnixTimeAsLocal.INSTANCE, list);
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    return FunctionValidatorKt.withArgumentsValidation(ToLowerCase.INSTANCE, list);
                }
                break;
            case -1133026611:
                if (str.equals("formatDateAsUTC")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsUTC.INSTANCE, list);
                }
                break;
            case -1131397482:
                if (str.equals("getUrlFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetUrlFromArray.INSTANCE, list);
                }
                break;
            case -1077888264:
                if (str.equals("getArrayOptBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptBoolean.INSTANCE, list);
                }
                break;
            case -1072121784:
                if (str.equals("parseUnixTime")) {
                    return FunctionValidatorKt.withArgumentsValidation(ParseUnixTime.INSTANCE, list);
                }
                break;
            case -1071222151:
                if (str.equals("getArrayOptNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptNumber.INSTANCE, list);
                }
                break;
            case -1013579358:
                if (str.equals("getColorFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetColorFromArray.INSTANCE, list);
                }
                break;
            case -1000110441:
                if (str.equals("getDictColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictColor.INSTANCE, list);
                }
                break;
            case -995871928:
                if (str.equals("padEnd")) {
                    PadEndInteger padEndInteger = PadEndInteger.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable4 = padEndInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok5 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable4, ok5)) {
                        return padEndInteger;
                    }
                    PadEndString padEndString = PadEndString.INSTANCE;
                    if (p.e(padEndString.matchesArguments$div_evaluable(list), ok5)) {
                        return padEndString;
                    }
                    if (p.e(padEndInteger.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                        return padEndInteger;
                    }
                    if (p.e(padEndString.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                        return padEndString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -962804868:
                if (str.equals("getOptArrayFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptArrayFromDict.INSTANCE, list);
                }
                break;
            case -928843967:
                if (str.equals("getArrayOptString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptString.INSTANCE, list);
                }
                break;
            case -905815078:
                if (str.equals("setDay")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetDay.INSTANCE, list);
                }
                break;
            case -902467307:
                if (str.equals("signum")) {
                    DoubleSignum doubleSignum = DoubleSignum.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable5 = doubleSignum.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok6 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable5, ok6)) {
                        return doubleSignum;
                    }
                    IntegerSignum integerSignum = IntegerSignum.INSTANCE;
                    if (p.e(integerSignum.matchesArguments$div_evaluable(list), ok6)) {
                        return integerSignum;
                    }
                    if (p.e(doubleSignum.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                        return doubleSignum;
                    }
                    if (p.e(integerSignum.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                        return integerSignum;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -863899827:
                if (str.equals("getColorFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetColorFromDict.INSTANCE, list);
                }
                break;
            case -823914681:
                if (str.equals("getStoredColorValue")) {
                    GetStoredColorValue getStoredColorValue = GetStoredColorValue.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable6 = getStoredColorValue.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok7 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable6, ok7)) {
                        return getStoredColorValue;
                    }
                    GetStoredColorValueString getStoredColorValueString = GetStoredColorValueString.INSTANCE;
                    if (p.e(getStoredColorValueString.matchesArguments$div_evaluable(list), ok7)) {
                        return getStoredColorValueString;
                    }
                    if (p.e(getStoredColorValue.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                        return getStoredColorValue;
                    }
                    if (p.e(getStoredColorValueString.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                        return getStoredColorValueString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -792903165:
                if (str.equals("getDictFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictFromArray.INSTANCE, list);
                }
                break;
            case -775185381:
                if (str.equals("setColorBlue")) {
                    ColorBlueComponentSetter colorBlueComponentSetter = ColorBlueComponentSetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable7 = colorBlueComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok8 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable7, ok8)) {
                        return colorBlueComponentSetter;
                    }
                    ColorStringBlueComponentSetter colorStringBlueComponentSetter = ColorStringBlueComponentSetter.INSTANCE;
                    if (p.e(colorStringBlueComponentSetter.matchesArguments$div_evaluable(list), ok8)) {
                        return colorStringBlueComponentSetter;
                    }
                    if (p.e(colorBlueComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                        return colorBlueComponentSetter;
                    }
                    if (p.e(colorStringBlueComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                        return colorStringBlueComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -757068958:
                if (str.equals("getStoredBooleanValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredBooleanValue.INSTANCE, list);
                }
                break;
            case -740156815:
                if (str.equals("getDayOfWeek")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDayOfWeek.INSTANCE, list);
                }
                break;
            case -719400499:
                if (str.equals("maxNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleMaxValue.INSTANCE, list);
                }
                break;
            case -718233908:
                if (str.equals("getDictFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictFromDict.INSTANCE, list);
                }
                break;
            case -711609332:
                if (str.equals("getStoredIntegerValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredIntegerValue.INSTANCE, list);
                }
                break;
            case -694406281:
                if (str.equals("toRadians")) {
                    return FunctionValidatorKt.withArgumentsValidation(DegreesToRadians.INSTANCE, list);
                }
                break;
            case -637295986:
                if (str.equals("getOptStringFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptStringFromDict.INSTANCE, list);
                }
                break;
            case -625627966:
                if (str.equals("getStoredDictValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredDictValue.INSTANCE, list);
                }
                break;
            case -618173803:
                if (str.equals("getDictNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictNumber.INSTANCE, list);
                }
                break;
            case -593965816:
                if (str.equals("getDictOptUrl")) {
                    GetDictOptUrlWithStringFallback getDictOptUrlWithStringFallback = GetDictOptUrlWithStringFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable8 = getDictOptUrlWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok9 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable8, ok9)) {
                        return getDictOptUrlWithStringFallback;
                    }
                    GetDictOptUrlWithUrlFallback getDictOptUrlWithUrlFallback = GetDictOptUrlWithUrlFallback.INSTANCE;
                    if (p.e(getDictOptUrlWithUrlFallback.matchesArguments$div_evaluable(list), ok9)) {
                        return getDictOptUrlWithUrlFallback;
                    }
                    if (p.e(getDictOptUrlWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                        return getDictOptUrlWithStringFallback;
                    }
                    if (p.e(getDictOptUrlWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                        return getDictOptUrlWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -567445985:
                if (str.equals("contains")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringContains.INSTANCE, list);
                }
                break;
            case -505987374:
                if (str.equals("copySign")) {
                    DoubleCopySign doubleCopySign = DoubleCopySign.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable9 = doubleCopySign.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok10 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable9, ok10)) {
                        return doubleCopySign;
                    }
                    IntegerCopySign integerCopySign = IntegerCopySign.INSTANCE;
                    if (p.e(integerCopySign.matchesArguments$div_evaluable(list), ok10)) {
                        return integerCopySign;
                    }
                    if (p.e(doubleCopySign.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                        return doubleCopySign;
                    }
                    if (p.e(integerCopySign.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                        return integerCopySign;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case -496262374:
                if (str.equals("trimRight")) {
                    return FunctionValidatorKt.withArgumentsValidation(TrimRight.INSTANCE, list);
                }
                break;
            case -475795619:
                if (str.equals("getDictString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictString.INSTANCE, list);
                }
                break;
            case -407622546:
                if (str.equals("getDictValues")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictValues.INSTANCE, list);
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    return FunctionValidatorKt.withArgumentsValidation(ToUpperCase.INSTANCE, list);
                }
                break;
            case -342730167:
                if (str.equals("getOptNumberFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptNumberFromArray.INSTANCE, list);
                }
                break;
            case -288070202:
                if (str.equals("getOptNumberFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptNumberFromDict.INSTANCE, list);
                }
                break;
            case -256399843:
                if (str.equals("setMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMinutes.INSTANCE, list);
                }
                break;
            case -230929496:
                if (str.equals("getIntegerFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerFromDict.INSTANCE, list);
                }
                break;
            case -181255609:
                if (str.equals("addMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(AddMillis.INSTANCE, list);
                }
                break;
            case -174963751:
                if (str.equals("getUrlFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetUrlFromDict.INSTANCE, list);
                }
                break;
            case -116997076:
                if (str.equals("toDegrees")) {
                    return FunctionValidatorKt.withArgumentsValidation(RadiansToDegrees.INSTANCE, list);
                }
                break;
            case -92937393:
                if (str.equals("getStoredNumberValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredNumberValue.INSTANCE, list);
                }
                break;
            case -74977101:
                if (str.equals("getYear")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetYear.INSTANCE, list);
                }
                break;
            case -57828916:
                if (str.equals("getArrayNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayNumber.INSTANCE, list);
                }
                break;
            case -33620929:
                if (str.equals("getArrayOptUrl")) {
                    GetArrayOptUrlWithStringFallback getArrayOptUrlWithStringFallback = GetArrayOptUrlWithStringFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable10 = getArrayOptUrlWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok11 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable10, ok11)) {
                        return getArrayOptUrlWithStringFallback;
                    }
                    GetArrayOptUrlWithUrlFallback getArrayOptUrlWithUrlFallback = GetArrayOptUrlWithUrlFallback.INSTANCE;
                    if (p.e(getArrayOptUrlWithUrlFallback.matchesArguments$div_evaluable(list), ok11)) {
                        return getArrayOptUrlWithUrlFallback;
                    }
                    if (p.e(getArrayOptUrlWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                        return getArrayOptUrlWithStringFallback;
                    }
                    if (p.e(getArrayOptUrlWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                        return getArrayOptUrlWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 3577:
                if (str.equals("pi")) {
                    return FunctionValidatorKt.withArgumentsValidation(Pi.INSTANCE, list);
                }
                break;
            case 96370:
                if (str.equals("abs")) {
                    DoubleAbs doubleAbs = DoubleAbs.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable11 = doubleAbs.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok12 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable11, ok12)) {
                        return doubleAbs;
                    }
                    IntegerAbs integerAbs = IntegerAbs.INSTANCE;
                    if (p.e(integerAbs.matchesArguments$div_evaluable(list), ok12)) {
                        return integerAbs;
                    }
                    if (p.e(doubleAbs.matchesArgumentsWithCast$div_evaluable(list), ok12)) {
                        return doubleAbs;
                    }
                    if (p.e(integerAbs.matchesArgumentsWithCast$div_evaluable(list), ok12)) {
                        return integerAbs;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 98695:
                if (str.equals("cos")) {
                    return FunctionValidatorKt.withArgumentsValidation(Cos.INSTANCE, list);
                }
                break;
            case 98696:
                if (str.equals("cot")) {
                    return FunctionValidatorKt.withArgumentsValidation(Cot.INSTANCE, list);
                }
                break;
            case 99473:
                if (str.equals("div")) {
                    DoubleDiv doubleDiv = DoubleDiv.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable12 = doubleDiv.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok13 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable12, ok13)) {
                        return doubleDiv;
                    }
                    IntegerDiv integerDiv = IntegerDiv.INSTANCE;
                    if (p.e(integerDiv.matchesArguments$div_evaluable(list), ok13)) {
                        return integerDiv;
                    }
                    if (p.e(doubleDiv.matchesArgumentsWithCast$div_evaluable(list), ok13)) {
                        return doubleDiv;
                    }
                    if (p.e(integerDiv.matchesArgumentsWithCast$div_evaluable(list), ok13)) {
                        return integerDiv;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 107029:
                if (str.equals("len")) {
                    GetArrayLength getArrayLength = GetArrayLength.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable13 = getArrayLength.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok14 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable13, ok14)) {
                        return getArrayLength;
                    }
                    GetDictLength getDictLength = GetDictLength.INSTANCE;
                    if (p.e(getDictLength.matchesArguments$div_evaluable(list), ok14)) {
                        return getDictLength;
                    }
                    StringLength stringLength = StringLength.INSTANCE;
                    if (p.e(stringLength.matchesArguments$div_evaluable(list), ok14)) {
                        return stringLength;
                    }
                    if (p.e(getArrayLength.matchesArgumentsWithCast$div_evaluable(list), ok14)) {
                        return getArrayLength;
                    }
                    if (p.e(getDictLength.matchesArgumentsWithCast$div_evaluable(list), ok14)) {
                        return getDictLength;
                    }
                    if (p.e(stringLength.matchesArgumentsWithCast$div_evaluable(list), ok14)) {
                        return stringLength;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 107876:
                if (str.equals("max")) {
                    DoubleMax doubleMax = DoubleMax.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable14 = doubleMax.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok15 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable14, ok15)) {
                        return doubleMax;
                    }
                    IntegerMax integerMax = IntegerMax.INSTANCE;
                    if (p.e(integerMax.matchesArguments$div_evaluable(list), ok15)) {
                        return integerMax;
                    }
                    if (p.e(doubleMax.matchesArgumentsWithCast$div_evaluable(list), ok15)) {
                        return doubleMax;
                    }
                    if (p.e(integerMax.matchesArgumentsWithCast$div_evaluable(list), ok15)) {
                        return integerMax;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    DoubleMin doubleMin = DoubleMin.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable15 = doubleMin.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok16 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable15, ok16)) {
                        return doubleMin;
                    }
                    IntegerMin integerMin = IntegerMin.INSTANCE;
                    if (p.e(integerMin.matchesArguments$div_evaluable(list), ok16)) {
                        return integerMin;
                    }
                    if (p.e(doubleMin.matchesArgumentsWithCast$div_evaluable(list), ok16)) {
                        return doubleMin;
                    }
                    if (p.e(integerMin.matchesArgumentsWithCast$div_evaluable(list), ok16)) {
                        return integerMin;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 108290:
                if (str.equals("mod")) {
                    DoubleMod doubleMod = DoubleMod.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable16 = doubleMod.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok17 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable16, ok17)) {
                        return doubleMod;
                    }
                    IntegerMod integerMod = IntegerMod.INSTANCE;
                    if (p.e(integerMod.matchesArguments$div_evaluable(list), ok17)) {
                        return integerMod;
                    }
                    if (p.e(doubleMod.matchesArgumentsWithCast$div_evaluable(list), ok17)) {
                        return doubleMod;
                    }
                    if (p.e(integerMod.matchesArgumentsWithCast$div_evaluable(list), ok17)) {
                        return integerMod;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 108484:
                if (str.equals("mul")) {
                    DoubleMul doubleMul = DoubleMul.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable17 = doubleMul.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok18 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable17, ok18)) {
                        return doubleMul;
                    }
                    IntegerMul integerMul = IntegerMul.INSTANCE;
                    if (p.e(integerMul.matchesArguments$div_evaluable(list), ok18)) {
                        return integerMul;
                    }
                    if (p.e(doubleMul.matchesArgumentsWithCast$div_evaluable(list), ok18)) {
                        return doubleMul;
                    }
                    if (p.e(integerMul.matchesArgumentsWithCast$div_evaluable(list), ok18)) {
                        return integerMul;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 112845:
                if (str.equals("rgb")) {
                    return FunctionValidatorKt.withArgumentsValidation(ColorRgb.INSTANCE, list);
                }
                break;
            case 113880:
                if (str.equals("sin")) {
                    return FunctionValidatorKt.withArgumentsValidation(Sine.INSTANCE, list);
                }
                break;
            case 114240:
                if (str.equals("sub")) {
                    DoubleSub doubleSub = DoubleSub.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable18 = doubleSub.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok19 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable18, ok19)) {
                        return doubleSub;
                    }
                    IntegerSub integerSub = IntegerSub.INSTANCE;
                    if (p.e(integerSub.matchesArguments$div_evaluable(list), ok19)) {
                        return integerSub;
                    }
                    if (p.e(doubleSub.matchesArgumentsWithCast$div_evaluable(list), ok19)) {
                        return doubleSub;
                    }
                    if (p.e(integerSub.matchesArgumentsWithCast$div_evaluable(list), ok19)) {
                        return integerSub;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 114251:
                if (str.equals("sum")) {
                    DoubleSum doubleSum = DoubleSum.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable19 = doubleSum.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok20 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable19, ok20)) {
                        return doubleSum;
                    }
                    IntegerSum integerSum = IntegerSum.INSTANCE;
                    if (p.e(integerSum.matchesArguments$div_evaluable(list), ok20)) {
                        return integerSum;
                    }
                    if (p.e(doubleSum.matchesArgumentsWithCast$div_evaluable(list), ok20)) {
                        return doubleSum;
                    }
                    if (p.e(integerSum.matchesArgumentsWithCast$div_evaluable(list), ok20)) {
                        return integerSum;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 114593:
                if (str.equals("tan")) {
                    return FunctionValidatorKt.withArgumentsValidation(Tan.INSTANCE, list);
                }
                break;
            case 2988422:
                if (str.equals("acos")) {
                    return FunctionValidatorKt.withArgumentsValidation(Acos.INSTANCE, list);
                }
                break;
            case 3002572:
                if (str.equals("argb")) {
                    return FunctionValidatorKt.withArgumentsValidation(ColorArgb.INSTANCE, list);
                }
                break;
            case 3003607:
                if (str.equals("asin")) {
                    return FunctionValidatorKt.withArgumentsValidation(Asin.INSTANCE, list);
                }
                break;
            case 3004320:
                if (str.equals("atan")) {
                    return FunctionValidatorKt.withArgumentsValidation(Atan.INSTANCE, list);
                }
                break;
            case 3049733:
                if (str.equals("ceil")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleCeil.INSTANCE, list);
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    return FunctionValidatorKt.withArgumentsValidation(Trim.INSTANCE, list);
                }
                break;
            case 53078075:
                if (str.equals("minNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleMinValue.INSTANCE, list);
                }
                break;
            case 81708636:
                if (str.equals("getDictBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictBoolean.INSTANCE, list);
                }
                break;
            case 84549268:
                if (str.equals("getArrayString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayString.INSTANCE, list);
                }
                break;
            case 88715890:
                if (str.equals("getNumberValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberValue.INSTANCE, list);
                }
                break;
            case 93133970:
                if (str.equals("atan2")) {
                    return FunctionValidatorKt.withArgumentsValidation(Atan2.INSTANCE, list);
                }
                break;
            case 97526796:
                if (str.equals("floor")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleFloor.INSTANCE, list);
                }
                break;
            case 100346066:
                if (str.equals("index")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringIndex.INSTANCE, list);
                }
                break;
            case 108704142:
                if (str.equals("round")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleRound.INSTANCE, list);
                }
                break;
            case 110520564:
                if (str.equals("toUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringToUrl.INSTANCE, list);
                }
                break;
            case 181165108:
                if (str.equals("formatDateAsLocalWithLocale")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsLocalWithLocale.INSTANCE, list);
                }
                break;
            case 215331667:
                if (str.equals("getOptArrayFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptArrayFromArray.INSTANCE, list);
                }
                break;
            case 232128784:
                if (str.equals("getDictOptNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptNumber.INSTANCE, list);
                }
                break;
            case 272530949:
                if (str.equals("getArrayBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayBoolean.INSTANCE, list);
                }
                break;
            case 294836803:
                if (str.equals("toInteger")) {
                    BooleanToInteger booleanToInteger = BooleanToInteger.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable20 = booleanToInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok21 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable20, ok21)) {
                        return booleanToInteger;
                    }
                    NumberToInteger numberToInteger = NumberToInteger.INSTANCE;
                    if (p.e(numberToInteger.matchesArguments$div_evaluable(list), ok21)) {
                        return numberToInteger;
                    }
                    StringToInteger stringToInteger = StringToInteger.INSTANCE;
                    if (p.e(stringToInteger.matchesArguments$div_evaluable(list), ok21)) {
                        return stringToInteger;
                    }
                    if (p.e(booleanToInteger.matchesArgumentsWithCast$div_evaluable(list), ok21)) {
                        return booleanToInteger;
                    }
                    if (p.e(numberToInteger.matchesArgumentsWithCast$div_evaluable(list), ok21)) {
                        return numberToInteger;
                    }
                    if (p.e(stringToInteger.matchesArgumentsWithCast$div_evaluable(list), ok21)) {
                        return stringToInteger;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 374506968:
                if (str.equals("getDictOptString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptString.INSTANCE, list);
                }
                break;
            case 407302472:
                if (str.equals("setMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMillis.INSTANCE, list);
                }
                break;
            case 412791996:
                if (str.equals("getDictOptColor")) {
                    GetDictOptColorWithColorFallback getDictOptColorWithColorFallback = GetDictOptColorWithColorFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable21 = getDictOptColorWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok22 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable21, ok22)) {
                        return getDictOptColorWithColorFallback;
                    }
                    GetDictOptColorWithStringFallback getDictOptColorWithStringFallback = GetDictOptColorWithStringFallback.INSTANCE;
                    if (p.e(getDictOptColorWithStringFallback.matchesArguments$div_evaluable(list), ok22)) {
                        return getDictOptColorWithStringFallback;
                    }
                    if (p.e(getDictOptColorWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok22)) {
                        return getDictOptColorWithColorFallback;
                    }
                    if (p.e(getDictOptColorWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok22)) {
                        return getDictOptColorWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 515198110:
                if (str.equals("decodeUri")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringDecodeUri.INSTANCE, list);
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringSubstring.INSTANCE, list);
                }
                break;
            case 579215519:
                if (str.equals("getBooleanValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanValue.INSTANCE, list);
                }
                break;
            case 609553469:
                if (str.equals("getOptUrlFromArray")) {
                    GetOptUrlFromArrayWithStringFallback getOptUrlFromArrayWithStringFallback = GetOptUrlFromArrayWithStringFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable22 = getOptUrlFromArrayWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok23 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable22, ok23)) {
                        return getOptUrlFromArrayWithStringFallback;
                    }
                    GetOptUrlFromArrayWithUrlFallback getOptUrlFromArrayWithUrlFallback = GetOptUrlFromArrayWithUrlFallback.INSTANCE;
                    if (p.e(getOptUrlFromArrayWithUrlFallback.matchesArguments$div_evaluable(list), ok23)) {
                        return getOptUrlFromArrayWithUrlFallback;
                    }
                    if (p.e(getOptUrlFromArrayWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok23)) {
                        return getOptUrlFromArrayWithStringFallback;
                    }
                    if (p.e(getOptUrlFromArrayWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok23)) {
                        return getOptUrlFromArrayWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 621919548:
                if (str.equals("getMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMillis.INSTANCE, list);
                }
                break;
            case 624675145:
                if (str.equals("getIntegerValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerValue.INSTANCE, list);
                }
                break;
            case 648795069:
                if (str.equals("setSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetSeconds.INSTANCE, list);
                }
                break;
            case 671285057:
                if (str.equals("getDictOptBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptBoolean.INSTANCE, list);
                }
                break;
            case 757893007:
                if (str.equals("padStart")) {
                    PadStartInteger padStartInteger = PadStartInteger.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable23 = padStartInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok24 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable23, ok24)) {
                        return padStartInteger;
                    }
                    PadStartString padStartString = PadStartString.INSTANCE;
                    if (p.e(padStartString.matchesArguments$div_evaluable(list), ok24)) {
                        return padStartString;
                    }
                    if (p.e(padStartInteger.matchesArgumentsWithCast$div_evaluable(list), ok24)) {
                        return padStartInteger;
                    }
                    if (p.e(padStartString.matchesArgumentsWithCast$div_evaluable(list), ok24)) {
                        return padStartString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 785010124:
                if (str.equals("getArrayUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayUrl.INSTANCE, list);
                }
                break;
            case 815452174:
                if (str.equals("getArrayOptInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptInteger.INSTANCE, list);
                }
                break;
            case 833284859:
                if (str.equals("getStoredUrlValue")) {
                    GetStoredUrlValueWithStringFallback getStoredUrlValueWithStringFallback = GetStoredUrlValueWithStringFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable24 = getStoredUrlValueWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok25 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable24, ok25)) {
                        return getStoredUrlValueWithStringFallback;
                    }
                    GetStoredUrlValueWithUrlFallback getStoredUrlValueWithUrlFallback = GetStoredUrlValueWithUrlFallback.INSTANCE;
                    if (p.e(getStoredUrlValueWithUrlFallback.matchesArguments$div_evaluable(list), ok25)) {
                        return getStoredUrlValueWithUrlFallback;
                    }
                    if (p.e(getStoredUrlValueWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok25)) {
                        return getStoredUrlValueWithStringFallback;
                    }
                    if (p.e(getStoredUrlValueWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok25)) {
                        return getStoredUrlValueWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 851027282:
                if (str.equals("getOptUrlFromDict")) {
                    GetOptUrlFromDictWithStringFallback getOptUrlFromDictWithStringFallback = GetOptUrlFromDictWithStringFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable25 = getOptUrlFromDictWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok26 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable25, ok26)) {
                        return getOptUrlFromDictWithStringFallback;
                    }
                    GetOptUrlFromDictWithUrlFallback getOptUrlFromDictWithUrlFallback = GetOptUrlFromDictWithUrlFallback.INSTANCE;
                    if (p.e(getOptUrlFromDictWithUrlFallback.matchesArguments$div_evaluable(list), ok26)) {
                        return getOptUrlFromDictWithUrlFallback;
                    }
                    if (p.e(getOptUrlFromDictWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok26)) {
                        return getOptUrlFromDictWithStringFallback;
                    }
                    if (p.e(getOptUrlFromDictWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok26)) {
                        return getOptUrlFromDictWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 902290499:
                if (str.equals("getArrayFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayFromDict.INSTANCE, list);
                }
                break;
            case 963997617:
                if (str.equals("getColorAlpha")) {
                    ColorAlphaComponentGetter colorAlphaComponentGetter = ColorAlphaComponentGetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable26 = colorAlphaComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok27 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable26, ok27)) {
                        return colorAlphaComponentGetter;
                    }
                    ColorStringAlphaComponentGetter colorStringAlphaComponentGetter = ColorStringAlphaComponentGetter.INSTANCE;
                    if (p.e(colorStringAlphaComponentGetter.matchesArguments$div_evaluable(list), ok27)) {
                        return colorStringAlphaComponentGetter;
                    }
                    if (p.e(colorAlphaComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok27)) {
                        return colorAlphaComponentGetter;
                    }
                    if (p.e(colorStringAlphaComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok27)) {
                        return colorStringAlphaComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 968898065:
                if (str.equals("getStoredArrayValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredArrayValue.INSTANCE, list);
                }
                break;
            case 969706838:
                if (str.equals("getColorGreen")) {
                    ColorGreenComponentGetter colorGreenComponentGetter = ColorGreenComponentGetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable27 = colorGreenComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok28 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable27, ok28)) {
                        return colorGreenComponentGetter;
                    }
                    ColorStringGreenComponentGetter colorStringGreenComponentGetter = ColorStringGreenComponentGetter.INSTANCE;
                    if (p.e(colorStringGreenComponentGetter.matchesArguments$div_evaluable(list), ok28)) {
                        return colorStringGreenComponentGetter;
                    }
                    if (p.e(colorGreenComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok28)) {
                        return colorGreenComponentGetter;
                    }
                    if (p.e(colorStringGreenComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok28)) {
                        return colorStringGreenComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 983060420:
                if (str.equals("getColorValue")) {
                    GetColorValue getColorValue = GetColorValue.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable28 = getColorValue.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok29 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable28, ok29)) {
                        return getColorValue;
                    }
                    GetColorValueString getColorValueString = GetColorValueString.INSTANCE;
                    if (p.e(getColorValueString.matchesArguments$div_evaluable(list), ok29)) {
                        return getColorValueString;
                    }
                    if (p.e(getColorValue.matchesArgumentsWithCast$div_evaluable(list), ok29)) {
                        return getColorValue;
                    }
                    if (p.e(getColorValueString.matchesArgumentsWithCast$div_evaluable(list), ok29)) {
                        return getColorValueString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1012555088:
                if (str.equals("getNumberFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberFromArray.INSTANCE, list);
                }
                break;
            case 1022717043:
                if (str.equals("getOptDictFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptDictFromDict.INSTANCE, list);
                }
                break;
            case 1098852024:
                if (str.equals("getUrlValue")) {
                    GetUrlValueWithStringFallback getUrlValueWithStringFallback = GetUrlValueWithStringFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable29 = getUrlValueWithStringFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok30 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable29, ok30)) {
                        return getUrlValueWithStringFallback;
                    }
                    GetUrlValueWithUrlFallback getUrlValueWithUrlFallback = GetUrlValueWithUrlFallback.INSTANCE;
                    if (p.e(getUrlValueWithUrlFallback.matchesArguments$div_evaluable(list), ok30)) {
                        return getUrlValueWithUrlFallback;
                    }
                    if (p.e(getUrlValueWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok30)) {
                        return getUrlValueWithStringFallback;
                    }
                    if (p.e(getUrlValueWithUrlFallback.matchesArgumentsWithCast$div_evaluable(list), ok30)) {
                        return getUrlValueWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable30 = integerDecimalFormat.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok31 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable30, ok31)) {
                        return integerDecimalFormat;
                    }
                    LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
                    if (p.e(localizedIntegerDecimalFormat.matchesArguments$div_evaluable(list), ok31)) {
                        return localizedIntegerDecimalFormat;
                    }
                    LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
                    if (p.e(localizedNumberDecimalFormat.matchesArguments$div_evaluable(list), ok31)) {
                        return localizedNumberDecimalFormat;
                    }
                    NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
                    if (p.e(numberDecimalFormat.matchesArguments$div_evaluable(list), ok31)) {
                        return numberDecimalFormat;
                    }
                    if (p.e(integerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok31)) {
                        return integerDecimalFormat;
                    }
                    if (p.e(localizedIntegerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok31)) {
                        return localizedIntegerDecimalFormat;
                    }
                    if (p.e(localizedNumberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok31)) {
                        return localizedNumberDecimalFormat;
                    }
                    if (p.e(numberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok31)) {
                        return numberDecimalFormat;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1298006409:
                if (str.equals("getOptColorFromArray")) {
                    GetOptColorFromArrayWithColorFallback getOptColorFromArrayWithColorFallback = GetOptColorFromArrayWithColorFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable31 = getOptColorFromArrayWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok32 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable31, ok32)) {
                        return getOptColorFromArrayWithColorFallback;
                    }
                    GetOptColorFromArrayWithStringFallback getOptColorFromArrayWithStringFallback = GetOptColorFromArrayWithStringFallback.INSTANCE;
                    if (p.e(getOptColorFromArrayWithStringFallback.matchesArguments$div_evaluable(list), ok32)) {
                        return getOptColorFromArrayWithStringFallback;
                    }
                    if (p.e(getOptColorFromArrayWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok32)) {
                        return getOptColorFromArrayWithColorFallback;
                    }
                    if (p.e(getOptColorFromArrayWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok32)) {
                        return getOptColorFromArrayWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1309020812:
                if (str.equals("minInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(IntegerMinValue.INSTANCE, list);
                }
                break;
            case 1335732619:
                if (str.equals("getOptBooleanFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptBooleanFromDict.INSTANCE, list);
                }
                break;
            case 1346085543:
                if (str.equals("getStringFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringFromDict.INSTANCE, list);
                }
                break;
            case 1360482480:
                if (str.equals("setColorRed")) {
                    ColorRedComponentSetter colorRedComponentSetter = ColorRedComponentSetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable32 = colorRedComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok33 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable32, ok33)) {
                        return colorRedComponentSetter;
                    }
                    ColorStringRedComponentSetter colorStringRedComponentSetter = ColorStringRedComponentSetter.INSTANCE;
                    if (p.e(colorStringRedComponentSetter.matchesArguments$div_evaluable(list), ok33)) {
                        return colorStringRedComponentSetter;
                    }
                    if (p.e(colorRedComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok33)) {
                        return colorRedComponentSetter;
                    }
                    if (p.e(colorStringRedComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok33)) {
                        return colorStringRedComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1394182093:
                if (str.equals("setHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetHours.INSTANCE, list);
                }
                break;
            case 1398793022:
                if (str.equals("setMonth")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMonth.INSTANCE, list);
                }
                break;
            case 1428631719:
                if (str.equals("getIntegerFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerFromArray.INSTANCE, list);
                }
                break;
            case 1449062308:
                if (str.equals("getColorRed")) {
                    ColorRedComponentGetter colorRedComponentGetter = ColorRedComponentGetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable33 = colorRedComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok34 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable33, ok34)) {
                        return colorRedComponentGetter;
                    }
                    ColorStringRedComponentGetter colorStringRedComponentGetter = ColorStringRedComponentGetter.INSTANCE;
                    if (p.e(colorStringRedComponentGetter.matchesArguments$div_evaluable(list), ok34)) {
                        return colorStringRedComponentGetter;
                    }
                    if (p.e(colorRedComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok34)) {
                        return colorRedComponentGetter;
                    }
                    if (p.e(colorStringRedComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok34)) {
                        return colorStringRedComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1507829577:
                if (str.equals("trimLeft")) {
                    return FunctionValidatorKt.withArgumentsValidation(TrimLeft.INSTANCE, list);
                }
                break;
            case 1508134774:
                if (str.equals("encodeUri")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringEncodeUri.INSTANCE, list);
                }
                break;
            case 1565972102:
                if (str.equals("getOptColorFromDict")) {
                    GetOptColorFromDictWithColorFallback getOptColorFromDictWithColorFallback = GetOptColorFromDictWithColorFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable34 = getOptColorFromDictWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok35 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable34, ok35)) {
                        return getOptColorFromDictWithColorFallback;
                    }
                    GetOptColorFromDictWithStringFallback getOptColorFromDictWithStringFallback = GetOptColorFromDictWithStringFallback.INSTANCE;
                    if (p.e(getOptColorFromDictWithStringFallback.matchesArguments$div_evaluable(list), ok35)) {
                        return getOptColorFromDictWithStringFallback;
                    }
                    if (p.e(getOptColorFromDictWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok35)) {
                        return getOptColorFromDictWithColorFallback;
                    }
                    if (p.e(getOptColorFromDictWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok35)) {
                        return getOptColorFromDictWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1636968764:
                if (str.equals("getOptDictFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptDictFromArray.INSTANCE, list);
                }
                break;
            case 1644730933:
                if (str.equals("nowLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(NowLocal.INSTANCE, list);
                }
                break;
            case 1695311327:
                if (str.equals("getNumberFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberFromDict.INSTANCE, list);
                }
                break;
            case 1716172417:
                if (str.equals("getOptStringFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptStringFromArray.INSTANCE, list);
                }
                break;
            case 1738128829:
                if (str.equals("setColorAlpha")) {
                    ColorAlphaComponentSetter colorAlphaComponentSetter = ColorAlphaComponentSetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable35 = colorAlphaComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok36 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable35, ok36)) {
                        return colorAlphaComponentSetter;
                    }
                    ColorStringAlphaComponentSetter colorStringAlphaComponentSetter = ColorStringAlphaComponentSetter.INSTANCE;
                    if (p.e(colorStringAlphaComponentSetter.matchesArguments$div_evaluable(list), ok36)) {
                        return colorStringAlphaComponentSetter;
                    }
                    if (p.e(colorAlphaComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok36)) {
                        return colorAlphaComponentSetter;
                    }
                    if (p.e(colorStringAlphaComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok36)) {
                        return colorStringAlphaComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1743838050:
                if (str.equals("setColorGreen")) {
                    ColorGreenComponentSetter colorGreenComponentSetter = ColorGreenComponentSetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable36 = colorGreenComponentSetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok37 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable36, ok37)) {
                        return colorGreenComponentSetter;
                    }
                    ColorStringGreenComponentSetter colorStringGreenComponentSetter = ColorStringGreenComponentSetter.INSTANCE;
                    if (p.e(colorStringGreenComponentSetter.matchesArguments$div_evaluable(list), ok37)) {
                        return colorStringGreenComponentSetter;
                    }
                    if (p.e(colorGreenComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok37)) {
                        return colorGreenComponentSetter;
                    }
                    if (p.e(colorStringGreenComponentSetter.matchesArgumentsWithCast$div_evaluable(list), ok37)) {
                        return colorStringGreenComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1745084820:
                if (str.equals("getIntervalHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalHours.INSTANCE, list);
                }
                break;
            case 1814686973:
                if (str.equals("getBooleanFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanFromArray.INSTANCE, list);
                }
                break;
            case 1883462358:
                if (str.equals("getIntervalTotalMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalMinutes.INSTANCE, list);
                }
                break;
            case 1907630144:
                if (str.equals("getDictKeys")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictKeys.INSTANCE, list);
                }
                break;
            case 1910382545:
                if (str.equals("encodeRegex")) {
                    return FunctionValidatorKt.withArgumentsValidation(EncodeRegex.INSTANCE, list);
                }
                break;
            case 1953671716:
                if (str.equals("getIntervalMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalMinutes.INSTANCE, list);
                }
                break;
            case 1953831815:
                if (str.equals("getStoredStringValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredStringValue.INSTANCE, list);
                }
                break;
            case 1955294553:
                if (str.equals("getHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetHours.INSTANCE, list);
                }
                break;
            case 1959905482:
                if (str.equals("getMonth")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMonth.INSTANCE, list);
                }
                break;
            case 1970789287:
                if (str.equals("getColorBlue")) {
                    ColorBlueComponentGetter colorBlueComponentGetter = ColorBlueComponentGetter.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable37 = colorBlueComponentGetter.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok38 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable37, ok38)) {
                        return colorBlueComponentGetter;
                    }
                    ColorStringBlueComponentGetter colorStringBlueComponentGetter = ColorStringBlueComponentGetter.INSTANCE;
                    if (p.e(colorStringBlueComponentGetter.matchesArguments$div_evaluable(list), ok38)) {
                        return colorStringBlueComponentGetter;
                    }
                    if (p.e(colorBlueComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok38)) {
                        return colorBlueComponentGetter;
                    }
                    if (p.e(colorStringBlueComponentGetter.matchesArgumentsWithCast$div_evaluable(list), ok38)) {
                        return colorStringBlueComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 1975049074:
                if (str.equals("getDictInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictInteger.INSTANCE, list);
                }
                break;
            case 1985132479:
                if (str.equals("setYear")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetYear.INSTANCE, list);
                }
                break;
            case 1992807388:
                if (str.equals("lastIndex")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringLastIndex.INSTANCE, list);
                }
                break;
            case 2033316403:
                if (str.equals("getArrayOptColor")) {
                    GetArrayOptColorWithColorFallback getArrayOptColorWithColorFallback = GetArrayOptColorWithColorFallback.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable38 = getArrayOptColorWithColorFallback.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok39 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable38, ok39)) {
                        return getArrayOptColorWithColorFallback;
                    }
                    GetArrayOptColorWithStringFallback getArrayOptColorWithStringFallback = GetArrayOptColorWithStringFallback.INSTANCE;
                    if (p.e(getArrayOptColorWithStringFallback.matchesArguments$div_evaluable(list), ok39)) {
                        return getArrayOptColorWithStringFallback;
                    }
                    if (p.e(getArrayOptColorWithColorFallback.matchesArgumentsWithCast$div_evaluable(list), ok39)) {
                        return getArrayOptColorWithColorFallback;
                    }
                    if (p.e(getArrayOptColorWithStringFallback.matchesArgumentsWithCast$div_evaluable(list), ok39)) {
                        return getArrayOptColorWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(str, list, false, 4, null);
                }
                break;
            case 2075646548:
                if (str.equals("formatDateAsLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsLocal.INSTANCE, list);
                }
                break;
            case 2101762217:
                if (str.equals("getMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMinutes.INSTANCE, list);
                }
                break;
            case 2135485098:
                if (str.equals("getStringValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringValue.INSTANCE, list);
                }
                break;
        }
        throw new EvaluableException("Unknown function name: " + str + '.', null, 2, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function getMethod(String str, List<? extends EvaluableType> list) throws Exception {
        p.j(str, "name");
        p.j(list, "args");
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    ArrayToString arrayToString = ArrayToString.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable = arrayToString.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok2 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable, ok2)) {
                        return arrayToString;
                    }
                    BooleanToString booleanToString = BooleanToString.INSTANCE;
                    if (p.e(booleanToString.matchesArguments$div_evaluable(list), ok2)) {
                        return booleanToString;
                    }
                    ColorToString colorToString = ColorToString.INSTANCE;
                    if (p.e(colorToString.matchesArguments$div_evaluable(list), ok2)) {
                        return colorToString;
                    }
                    DictToString dictToString = DictToString.INSTANCE;
                    if (p.e(dictToString.matchesArguments$div_evaluable(list), ok2)) {
                        return dictToString;
                    }
                    IntegerToString integerToString = IntegerToString.INSTANCE;
                    if (p.e(integerToString.matchesArguments$div_evaluable(list), ok2)) {
                        return integerToString;
                    }
                    NumberToString numberToString = NumberToString.INSTANCE;
                    if (p.e(numberToString.matchesArguments$div_evaluable(list), ok2)) {
                        return numberToString;
                    }
                    StringToString stringToString = StringToString.INSTANCE;
                    if (p.e(stringToString.matchesArguments$div_evaluable(list), ok2)) {
                        return stringToString;
                    }
                    UrlToString urlToString = UrlToString.INSTANCE;
                    if (p.e(urlToString.matchesArguments$div_evaluable(list), ok2)) {
                        return urlToString;
                    }
                    if (p.e(arrayToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return arrayToString;
                    }
                    if (p.e(booleanToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return booleanToString;
                    }
                    if (p.e(colorToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return colorToString;
                    }
                    if (p.e(dictToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return dictToString;
                    }
                    if (p.e(integerToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return integerToString;
                    }
                    if (p.e(numberToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return numberToString;
                    }
                    if (p.e(stringToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return stringToString;
                    }
                    if (p.e(urlToString.matchesArgumentsWithCast$div_evaluable(list), ok2)) {
                        return urlToString;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case -1300054776:
                if (str.equals("getInteger")) {
                    ArrayGetInteger arrayGetInteger = ArrayGetInteger.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable2 = arrayGetInteger.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok3 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable2, ok3)) {
                        return arrayGetInteger;
                    }
                    GetInteger getInteger = GetInteger.INSTANCE;
                    if (p.e(getInteger.matchesArguments$div_evaluable(list), ok3)) {
                        return getInteger;
                    }
                    if (p.e(arrayGetInteger.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return arrayGetInteger;
                    }
                    if (p.e(getInteger.matchesArgumentsWithCast$div_evaluable(list), ok3)) {
                        return getInteger;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case -1249348039:
                if (str.equals("getUrl")) {
                    ArrayGetUrl arrayGetUrl = ArrayGetUrl.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable3 = arrayGetUrl.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok4 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable3, ok4)) {
                        return arrayGetUrl;
                    }
                    GetUrl getUrl = GetUrl.INSTANCE;
                    if (p.e(getUrl.matchesArguments$div_evaluable(list), ok4)) {
                        return getUrl;
                    }
                    if (p.e(arrayGetUrl.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                        return arrayGetUrl;
                    }
                    if (p.e(getUrl.matchesArgumentsWithCast$div_evaluable(list), ok4)) {
                        return getUrl;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case -75598804:
                if (str.equals("getDict")) {
                    ArrayGetDict arrayGetDict = ArrayGetDict.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable4 = arrayGetDict.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok5 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable4, ok5)) {
                        return arrayGetDict;
                    }
                    GetDict getDict = GetDict.INSTANCE;
                    if (p.e(getDict.matchesArguments$div_evaluable(list), ok5)) {
                        return getDict;
                    }
                    if (p.e(arrayGetDict.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                        return arrayGetDict;
                    }
                    if (p.e(getDict.matchesArgumentsWithCast$div_evaluable(list), ok5)) {
                        return getDict;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case -75393430:
                if (str.equals("getKeys")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetKeys.INSTANCE, list);
                }
                break;
            case 208013248:
                if (str.equals("containsKey")) {
                    return FunctionValidatorKt.withArgumentsValidation(DictContainsKey.INSTANCE, list);
                }
                break;
            case 661651007:
                if (str.equals("getNumber")) {
                    ArrayGetNumber arrayGetNumber = ArrayGetNumber.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable5 = arrayGetNumber.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok6 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable5, ok6)) {
                        return arrayGetNumber;
                    }
                    GetNumber getNumber = GetNumber.INSTANCE;
                    if (p.e(getNumber.matchesArguments$div_evaluable(list), ok6)) {
                        return getNumber;
                    }
                    if (p.e(arrayGetNumber.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                        return arrayGetNumber;
                    }
                    if (p.e(getNumber.matchesArgumentsWithCast$div_evaluable(list), ok6)) {
                        return getNumber;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case 804029191:
                if (str.equals("getString")) {
                    ArrayGetString arrayGetString = ArrayGetString.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable6 = arrayGetString.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok7 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable6, ok7)) {
                        return arrayGetString;
                    }
                    GetString getString = GetString.INSTANCE;
                    if (p.e(getString.matchesArguments$div_evaluable(list), ok7)) {
                        return getString;
                    }
                    if (p.e(arrayGetString.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                        return arrayGetString;
                    }
                    if (p.e(getString.matchesArgumentsWithCast$div_evaluable(list), ok7)) {
                        return getString;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case 872202264:
                if (str.equals("getValues")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetValues.INSTANCE, list);
                }
                break;
            case 1101572082:
                if (str.equals("getBoolean")) {
                    ArrayGetBoolean arrayGetBoolean = ArrayGetBoolean.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable7 = arrayGetBoolean.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok8 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable7, ok8)) {
                        return arrayGetBoolean;
                    }
                    GetBoolean getBoolean = GetBoolean.INSTANCE;
                    if (p.e(getBoolean.matchesArguments$div_evaluable(list), ok8)) {
                        return getBoolean;
                    }
                    if (p.e(arrayGetBoolean.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                        return arrayGetBoolean;
                    }
                    if (p.e(getBoolean.matchesArgumentsWithCast$div_evaluable(list), ok8)) {
                        return getBoolean;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable8 = integerDecimalFormat.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok9 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable8, ok9)) {
                        return integerDecimalFormat;
                    }
                    LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
                    if (p.e(localizedIntegerDecimalFormat.matchesArguments$div_evaluable(list), ok9)) {
                        return localizedIntegerDecimalFormat;
                    }
                    LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
                    if (p.e(localizedNumberDecimalFormat.matchesArguments$div_evaluable(list), ok9)) {
                        return localizedNumberDecimalFormat;
                    }
                    NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
                    if (p.e(numberDecimalFormat.matchesArguments$div_evaluable(list), ok9)) {
                        return numberDecimalFormat;
                    }
                    if (p.e(integerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                        return integerDecimalFormat;
                    }
                    if (p.e(localizedIntegerDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                        return localizedIntegerDecimalFormat;
                    }
                    if (p.e(localizedNumberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                        return localizedNumberDecimalFormat;
                    }
                    if (p.e(numberDecimalFormat.matchesArgumentsWithCast$div_evaluable(list), ok9)) {
                        return numberDecimalFormat;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case 1948915875:
                if (str.equals("getArray")) {
                    ArrayGetArray arrayGetArray = ArrayGetArray.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable9 = arrayGetArray.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok10 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable9, ok10)) {
                        return arrayGetArray;
                    }
                    GetArray getArray = GetArray.INSTANCE;
                    if (p.e(getArray.matchesArguments$div_evaluable(list), ok10)) {
                        return getArray;
                    }
                    if (p.e(arrayGetArray.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                        return arrayGetArray;
                    }
                    if (p.e(getArray.matchesArgumentsWithCast$div_evaluable(list), ok10)) {
                        return getArray;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case 1950668205:
                if (str.equals("getColor")) {
                    ArrayGetColor arrayGetColor = ArrayGetColor.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable10 = arrayGetColor.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok11 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable10, ok11)) {
                        return arrayGetColor;
                    }
                    GetColor getColor = GetColor.INSTANCE;
                    if (p.e(getColor.matchesArguments$div_evaluable(list), ok11)) {
                        return getColor;
                    }
                    if (p.e(arrayGetColor.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                        return arrayGetColor;
                    }
                    if (p.e(getColor.matchesArgumentsWithCast$div_evaluable(list), ok11)) {
                        return getColor;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
            case 2058039875:
                if (str.equals("isEmpty")) {
                    ArrayIsEmpty arrayIsEmpty = ArrayIsEmpty.INSTANCE;
                    Function.MatchResult matchResultMatchesArguments$div_evaluable11 = arrayIsEmpty.matchesArguments$div_evaluable(list);
                    Function.MatchResult.Ok ok12 = Function.MatchResult.Ok.INSTANCE;
                    if (p.e(matchResultMatchesArguments$div_evaluable11, ok12)) {
                        return arrayIsEmpty;
                    }
                    DictIsEmpty dictIsEmpty = DictIsEmpty.INSTANCE;
                    if (p.e(dictIsEmpty.matchesArguments$div_evaluable(list), ok12)) {
                        return dictIsEmpty;
                    }
                    if (p.e(arrayIsEmpty.matchesArgumentsWithCast$div_evaluable(list), ok12)) {
                        return arrayIsEmpty;
                    }
                    if (p.e(dictIsEmpty.matchesArgumentsWithCast$div_evaluable(list), ok12)) {
                        return dictIsEmpty;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(str, list);
                }
                break;
        }
        throw new EvaluableException("Unknown method name: " + str + '.', null, 2, null);
    }
}
