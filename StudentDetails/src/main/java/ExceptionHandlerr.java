import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.soft.StudentDetails.exception.AgeNotAllowedException;



	@RestControllerAdvice
	public class ExceptionHandlerr {

		@ExceptionHandler(AgeNotAllowedException.class)
		
		public ResponseEntity<Object> nn(AgeNotAllowedException nne){
			return new ResponseEntity<> (nne.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

