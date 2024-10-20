package exception.ex1;

public class NetworkClientV1 {

    private final String address;
    public boolean conneccError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (conneccError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        //Connect Success
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + "서버에 데이터 전송 실패 : " + data);
            return "sendError";
        }

        //Send Success
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            conneccError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
