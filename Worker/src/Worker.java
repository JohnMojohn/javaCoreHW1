public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public  interface OnTaskErrorListener{
        void onError(String result);

    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Ошибка!!! " + i + " операция не выполнена!!!");
            } else
                callback.onDone("Операция " + i + " выполнена");
        }
    }

}
