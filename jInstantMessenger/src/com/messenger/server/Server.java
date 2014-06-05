package com.messenger.server;
/*
Copyright [2014] [Brandon Bluemner]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
/**
 * @version
 * @author Beta
 *
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int port;
	boolean keepRunning=true;
	
	/**
	 * Creates an instance of the server
	 * @param port Bind the Server to this TCP port.
	 */
	public Server(int port){
		this.port=port;
		
	}
	
	/**
	 * Starts The Server
	 */
	public void startServer( ){
		Thread t= new Thread(new Runnable( ){

			@Override
			public void run( ) {
				// TODO Code for running Here
				while(Server.this.keepRunning){
					
				}
				
				
			}});
		
		t.start( );
	}
	/**
	 * Stops The Server
	 */
	public void stopServer(){
		this.keepRunning=false;
	}
}
