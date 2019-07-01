import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class Application  extends AbstractVerticle {
    public  void  start(){
        Vertx vertx = Vertx.vertx();
        this.vertx.createHttpServer().requestHandler(req->{
            req.response()
                    .putHeader("content-type","text/plain")
                    .end("Hello from Vert.x!");
        }).listen(8000);
    }

}
