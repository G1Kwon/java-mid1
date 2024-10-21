package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
            client.disconnect();
        }
    }
}
