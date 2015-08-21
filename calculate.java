package ru.lesson.lessons;
public class calculate{

	private int result;

	public void add (int ... params){
		this.setResult(params[0]);
		for (int i = 1; i < params.length; i++){
			this.setResult(this.getResult() + params[i]);
		}
	}

	public void sub (int ... params){
		this.setResult(params[0]);
		for (int i = 1; i < params.length; i++){
			this.setResult(this.getResult() - params[i]);
		}
	}


	public void div (int ... params) throws UserExceptions{
		if (params.length>0){		
			this.setResult(params[0]);
			for (int i = 1; i < params.length; i++){
				if (params[i]==0) {
					throw new IllegalArgumentException("Div by 0");			
				}
				this.setResult(this.getResult() / params[i]);
			}
		}else{
			throw new UserExceptions("You should args");
		}
	}

	public void mul (int ... params){
		this.setResult(params[0]);
		for (int i = 1; i < params.length; i++){
			this.setResult(this.getResult()* params[i]);
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}