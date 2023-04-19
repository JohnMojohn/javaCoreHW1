public class Worker implements OnTaskDoneListener, OnTaskErrorListener {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    @Override
    public void onDone(String result) {

    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Ошибка!!! " + i + " операция не выполнена!!!");
            } else
                callback.onDone("Операция " + i + " выполнена");
        }
    }

    @Override
    public void onError(String result) {

    }
}
