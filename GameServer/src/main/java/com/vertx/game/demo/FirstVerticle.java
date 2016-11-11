package com.vertx.game.demo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.net.NetServer;

public class FirstVerticle extends AbstractVerticle {
	@Override
	public void start(Future<Void> fut) {

		NetServer server = vertx.createNetServer();

		server.listen(0, "localhost", res -> {

			if (res.succeeded()) {

				System.out.println("Server is now listening on actual port: " + server.actualPort());

			} else {

				System.out.println("Failed tobind!");

			}

		});
	}

}
