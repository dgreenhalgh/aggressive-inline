import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public class Sample {
    public static void main(String[] args) {
        printFormattedText("snake_case", camelCaseConverter);

        EventListener listener = new EventListener() {
            @Override
            public void onEventOccurred() {

            }
        };
    }

    private static void printFormattedText(String text, Function1<String, String> caseConverter) {
        System.out.println(caseConverter.invoke(text));
    }

    private static Function1<String, String> camelCaseConverter = (Function1<String, String>) s -> "";

    private static Function0<Integer> outputTwo = () -> 2;

    private static Function2<Boolean, Boolean, Boolean> logicalOr = (aBoolean, aBoolean2) -> aBoolean || aBoolean2;

    interface EventListener {
        void onEventOccurred();
    }
}
