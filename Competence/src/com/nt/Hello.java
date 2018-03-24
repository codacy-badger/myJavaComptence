package com.nt;

public class Hello {
	
	static int  x[]= {1,2,3,4,5};
	public static void main(String[] args) throws Exception {
		
	ThreadA a=new ThreadA("threadA");
	ThreadB b=new ThreadB("threadB");
	a.start();
	b.start();
	a.join();
	b.join();
	}
	
	static class ThreadA extends Thread{
     String s;
     ThreadA(String s){
			this.s=s;
		}
		public void run() {
			
			for(int i=0;i<x.length/2;i++) {
				
				System.out.println(s+"is printing"+x[i]);
				
			}
		}
			
		}
	
	
	static class ThreadB extends Thread{
	     String s;
	     ThreadB(String s){
				this.s=s;
			}
			public void run() {
				
				for(int i=x.length/2;i<x.length;i++) {
					System.out.println(s+"is printing"+x[i]);
					
					
				}
				}
			}
				
			}



	
