package santander.autosavings.middleware;

import org.junit.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootConfiguration()
@SpringBootTest
public class GoalTests {
<<<<<<< HEAD


=======
	
	@MockBean
	private GoalService mockGoalService;
	private Goal goalFrance;
	private Goal goalItaly;
	private List<Goal> listGoals = new ArrayList<>();
	private List<TransactionGoal> transactionsFrance = new ArrayList<>();
	private List<TransactionGoal> transactionsItaly = new ArrayList<>();
	
	@Before
	public void init() {
		
		MockitoAnnotations.initMocks(this);
		mockGoalService = mock(GoalService.class);
		
		transactionsFrance.add(new TransactionGoal("5cf58d24d817ae5a10a7233f", 80.00));			
		transactionsItaly.add(new TransactionGoal("5cf6c1c5d817ae5e28d094f7", 75.00));
		
		goalFrance = new Goal("5cf58d24d817ae5a10a78b3f", "France", 2000.0, 150.0, 0.0, null, null, transactionsFrance);
		goalItaly = new Goal("5cf6c1c5d817ae5e28d094fc", "Italy", 1000.0, 200.0, 0.0, null, null, transactionsItaly);
	
	
		
		listGoals.add(goalFrance);
		listGoals.add(goalItaly);
		
		listGoals.add(goalFrance);
		listGoals.add(goalItaly);
		
		when(mockGoalService.getListAllGoals()).thenReturn(listGoals);
	}
	
//	@Test
//	public void testGetListGoals() {		
//		List<Goal> goals = mockGoalService.getListAllGoals();
//		assertNotNull(goals);
//		assertEquals(2, goals.size());
//	}
	
//	@Test
//	public void testListGoalsURIaccess() throws URISyntaxException
//	{
//	    RestTemplate restTemplate = new RestTemplate();
//	     
//	    final String baseUrl = UrlRest.URL_BASE + UrlRest.BASE + UrlRest.GOAL_LIST;
//	    URI uri = new URI(baseUrl);
//	 
//	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
//	    
//	    assertEquals(200, result.getStatusCodeValue());
//	    assertEquals(true, result.getBody().contains("id"));
//	}
>>>>>>> 97a84b3d9bbdbdf9f922d5c12380451ba5187358
	
	@Test
	public void testCreateGoal() {
		
	}

}
