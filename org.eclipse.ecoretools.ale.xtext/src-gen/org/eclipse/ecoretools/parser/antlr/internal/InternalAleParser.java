package org.eclipse.ecoretools.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ecoretools.services.AleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_INT", "RULE_MULTOP", "RULE_STRING", "RULE_REAL", "RULE_LETTER", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "';'", "'import'", "'as'", "'use'", "'.'", "'open'", "'class'", "'extends'", "','", "'{'", "'}'", "'def'", "'override'", "'('", "')'", "'@'", "':='", "'for'", "'in'", "'['", "'..'", "']'", "'if'", "'else'", "'while'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'not'", "'-'", "'then'", "'endif'", "'let'", "':'", "'='", "'+'", "'<='", "'>='", "'!='", "'<>'", "'=='", "'<'", "'>'", "'select'", "'reject'", "'collect'", "'any'", "'exists'", "'forAll'", "'isUnique'", "'one'", "'sortedBy'", "'closure'", "'|'", "'true'", "'false'", "'null'", "'Sequence{'", "'OrderedSet{'", "'::'", "'String'", "'Integer'", "'Real'", "'Boolean'", "'Sequence('", "'OrderedSet('"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_REAL=8;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LETTER=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_MULTOP=6;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAle.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private AleGrammarAccess grammarAccess;

        public InternalAleParser(TokenStream input, AleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "rRoot";
       	}

       	@Override
       	protected AleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulerRoot"
    // InternalAle.g:70:1: entryRulerRoot returns [EObject current=null] : iv_rulerRoot= rulerRoot EOF ;
    public final EObject entryRulerRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerRoot = null;


        try {
            // InternalAle.g:70:46: (iv_rulerRoot= rulerRoot EOF )
            // InternalAle.g:71:2: iv_rulerRoot= rulerRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerRoot=rulerRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerRoot"


    // $ANTLR start "rulerRoot"
    // InternalAle.g:77:1: rulerRoot returns [EObject current=null] : (otherlv_0= 'behavior' rulerQualified otherlv_2= ';' ( rulerImport )* ( rulerService )* ( (lv_xtendedClasses_5_0= rulerClass ) )* ) ;
    public final EObject rulerRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_xtendedClasses_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:83:2: ( (otherlv_0= 'behavior' rulerQualified otherlv_2= ';' ( rulerImport )* ( rulerService )* ( (lv_xtendedClasses_5_0= rulerClass ) )* ) )
            // InternalAle.g:84:2: (otherlv_0= 'behavior' rulerQualified otherlv_2= ';' ( rulerImport )* ( rulerService )* ( (lv_xtendedClasses_5_0= rulerClass ) )* )
            {
            // InternalAle.g:84:2: (otherlv_0= 'behavior' rulerQualified otherlv_2= ';' ( rulerImport )* ( rulerService )* ( (lv_xtendedClasses_5_0= rulerClass ) )* )
            // InternalAle.g:85:3: otherlv_0= 'behavior' rulerQualified otherlv_2= ';' ( rulerImport )* ( rulerService )* ( (lv_xtendedClasses_5_0= rulerClass ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRRootAccess().getBehaviorKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRRootAccess().getRQualifiedParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            rulerQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRRootAccess().getSemicolonKeyword_2());
              		
            }
            // InternalAle.g:103:3: ( rulerImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAle.g:104:4: rulerImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRRootAccess().getRImportParserRuleCall_3());
            	      			
            	    }
            	    pushFollow(FOLLOW_5);
            	    rulerImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAle.g:115:3: ( rulerService )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAle.g:116:4: rulerService
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRRootAccess().getRServiceParserRuleCall_4());
            	      			
            	    }
            	    pushFollow(FOLLOW_6);
            	    rulerService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAle.g:127:3: ( (lv_xtendedClasses_5_0= rulerClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=21 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAle.g:128:4: (lv_xtendedClasses_5_0= rulerClass )
            	    {
            	    // InternalAle.g:128:4: (lv_xtendedClasses_5_0= rulerClass )
            	    // InternalAle.g:129:5: lv_xtendedClasses_5_0= rulerClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRRootAccess().getXtendedClassesRClassParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_xtendedClasses_5_0=rulerClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"xtendedClasses",
            	      						lv_xtendedClasses_5_0,
            	      						"org.eclipse.ecoretools.Ale.rClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerRoot"


    // $ANTLR start "entryRulerImport"
    // InternalAle.g:150:1: entryRulerImport returns [String current=null] : iv_rulerImport= rulerImport EOF ;
    public final String entryRulerImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerImport = null;


        try {
            // InternalAle.g:150:47: (iv_rulerImport= rulerImport EOF )
            // InternalAle.g:151:2: iv_rulerImport= rulerImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerImport=rulerImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerImport"


    // $ANTLR start "rulerImport"
    // InternalAle.g:157:1: rulerImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' this_rQualified_1= rulerQualified kw= 'as' this_Ident_3= RULE_IDENT kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_3=null;
        AntlrDatatypeRuleToken this_rQualified_1 = null;



        	enterRule();

        try {
            // InternalAle.g:163:2: ( (kw= 'import' this_rQualified_1= rulerQualified kw= 'as' this_Ident_3= RULE_IDENT kw= ';' ) )
            // InternalAle.g:164:2: (kw= 'import' this_rQualified_1= rulerQualified kw= 'as' this_Ident_3= RULE_IDENT kw= ';' )
            {
            // InternalAle.g:164:2: (kw= 'import' this_rQualified_1= rulerQualified kw= 'as' this_Ident_3= RULE_IDENT kw= ';' )
            // InternalAle.g:165:3: kw= 'import' this_rQualified_1= rulerQualified kw= 'as' this_Ident_3= RULE_IDENT kw= ';'
            {
            kw=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportAccess().getImportKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRImportAccess().getRQualifiedParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_8);
            this_rQualified_1=rulerQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_rQualified_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportAccess().getAsKeyword_2());
              		
            }
            this_Ident_3=(Token)match(input,RULE_IDENT,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_3, grammarAccess.getRImportAccess().getIdentTerminalRuleCall_3());
              		
            }
            kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerImport"


    // $ANTLR start "entryRulerService"
    // InternalAle.g:201:1: entryRulerService returns [String current=null] : iv_rulerService= rulerService EOF ;
    public final String entryRulerService() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerService = null;


        try {
            // InternalAle.g:201:48: (iv_rulerService= rulerService EOF )
            // InternalAle.g:202:2: iv_rulerService= rulerService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerService=rulerService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerService.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerService"


    // $ANTLR start "rulerService"
    // InternalAle.g:208:1: rulerService returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'use' this_Ident_1= RULE_IDENT (kw= '.' this_Ident_3= RULE_IDENT )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerService() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_1=null;
        Token this_Ident_3=null;


        	enterRule();

        try {
            // InternalAle.g:214:2: ( (kw= 'use' this_Ident_1= RULE_IDENT (kw= '.' this_Ident_3= RULE_IDENT )* kw= ';' ) )
            // InternalAle.g:215:2: (kw= 'use' this_Ident_1= RULE_IDENT (kw= '.' this_Ident_3= RULE_IDENT )* kw= ';' )
            {
            // InternalAle.g:215:2: (kw= 'use' this_Ident_1= RULE_IDENT (kw= '.' this_Ident_3= RULE_IDENT )* kw= ';' )
            // InternalAle.g:216:3: kw= 'use' this_Ident_1= RULE_IDENT (kw= '.' this_Ident_3= RULE_IDENT )* kw= ';'
            {
            kw=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRServiceAccess().getUseKeyword_0());
              		
            }
            this_Ident_1=(Token)match(input,RULE_IDENT,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_1, grammarAccess.getRServiceAccess().getIdentTerminalRuleCall_1());
              		
            }
            // InternalAle.g:228:3: (kw= '.' this_Ident_3= RULE_IDENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAle.g:229:4: kw= '.' this_Ident_3= RULE_IDENT
            	    {
            	    kw=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getRServiceAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    this_Ident_3=(Token)match(input,RULE_IDENT,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Ident_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Ident_3, grammarAccess.getRServiceAccess().getIdentTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRServiceAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerService"


    // $ANTLR start "entryRulerClass"
    // InternalAle.g:251:1: entryRulerClass returns [EObject current=null] : iv_rulerClass= rulerClass EOF ;
    public final EObject entryRulerClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerClass = null;


        try {
            // InternalAle.g:251:47: (iv_rulerClass= rulerClass EOF )
            // InternalAle.g:252:2: iv_rulerClass= rulerClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerClass=rulerClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerClass"


    // $ANTLR start "rulerClass"
    // InternalAle.g:258:1: rulerClass returns [EObject current=null] : ( ( () ( (lv_openClass_1_0= rulerOpenClass ) ) ) | ( () ( (lv_newClass_3_0= rulerNewClass ) ) ) ) ;
    public final EObject rulerClass() throws RecognitionException {
        EObject current = null;

        EObject lv_openClass_1_0 = null;

        EObject lv_newClass_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:264:2: ( ( ( () ( (lv_openClass_1_0= rulerOpenClass ) ) ) | ( () ( (lv_newClass_3_0= rulerNewClass ) ) ) ) )
            // InternalAle.g:265:2: ( ( () ( (lv_openClass_1_0= rulerOpenClass ) ) ) | ( () ( (lv_newClass_3_0= rulerNewClass ) ) ) )
            {
            // InternalAle.g:265:2: ( ( () ( (lv_openClass_1_0= rulerOpenClass ) ) ) | ( () ( (lv_newClass_3_0= rulerNewClass ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:266:3: ( () ( (lv_openClass_1_0= rulerOpenClass ) ) )
                    {
                    // InternalAle.g:266:3: ( () ( (lv_openClass_1_0= rulerOpenClass ) ) )
                    // InternalAle.g:267:4: () ( (lv_openClass_1_0= rulerOpenClass ) )
                    {
                    // InternalAle.g:267:4: ()
                    // InternalAle.g:268:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRClassAccess().getROpenClassAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:277:4: ( (lv_openClass_1_0= rulerOpenClass ) )
                    // InternalAle.g:278:5: (lv_openClass_1_0= rulerOpenClass )
                    {
                    // InternalAle.g:278:5: (lv_openClass_1_0= rulerOpenClass )
                    // InternalAle.g:279:6: lv_openClass_1_0= rulerOpenClass
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRClassAccess().getOpenClassROpenClassParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_openClass_1_0=rulerOpenClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRClassRule());
                      						}
                      						set(
                      							current,
                      							"openClass",
                      							lv_openClass_1_0,
                      							"org.eclipse.ecoretools.Ale.rOpenClass");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:298:3: ( () ( (lv_newClass_3_0= rulerNewClass ) ) )
                    {
                    // InternalAle.g:298:3: ( () ( (lv_newClass_3_0= rulerNewClass ) ) )
                    // InternalAle.g:299:4: () ( (lv_newClass_3_0= rulerNewClass ) )
                    {
                    // InternalAle.g:299:4: ()
                    // InternalAle.g:300:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRClassAccess().getRNewClassAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:309:4: ( (lv_newClass_3_0= rulerNewClass ) )
                    // InternalAle.g:310:5: (lv_newClass_3_0= rulerNewClass )
                    {
                    // InternalAle.g:310:5: (lv_newClass_3_0= rulerNewClass )
                    // InternalAle.g:311:6: lv_newClass_3_0= rulerNewClass
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRClassAccess().getNewClassRNewClassParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_newClass_3_0=rulerNewClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRClassRule());
                      						}
                      						set(
                      							current,
                      							"newClass",
                      							lv_newClass_3_0,
                      							"org.eclipse.ecoretools.Ale.rNewClass");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerClass"


    // $ANTLR start "entryRulerOpenClass"
    // InternalAle.g:333:1: entryRulerOpenClass returns [EObject current=null] : iv_rulerOpenClass= rulerOpenClass EOF ;
    public final EObject entryRulerOpenClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerOpenClass = null;


        try {
            // InternalAle.g:333:51: (iv_rulerOpenClass= rulerOpenClass EOF )
            // InternalAle.g:334:2: iv_rulerOpenClass= rulerOpenClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getROpenClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerOpenClass=rulerOpenClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerOpenClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerOpenClass"


    // $ANTLR start "rulerOpenClass"
    // InternalAle.g:340:1: rulerOpenClass returns [EObject current=null] : (otherlv_0= 'open' otherlv_1= 'class' ( (lv_name_2_0= rulerQualified ) ) (otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )* )? otherlv_7= '{' ( (lv_attributes_8_0= rulerAttribute ) )* ( (lv_operations_9_0= rulerOperation ) )* otherlv_10= '}' ) ;
    public final EObject rulerOpenClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:346:2: ( (otherlv_0= 'open' otherlv_1= 'class' ( (lv_name_2_0= rulerQualified ) ) (otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )* )? otherlv_7= '{' ( (lv_attributes_8_0= rulerAttribute ) )* ( (lv_operations_9_0= rulerOperation ) )* otherlv_10= '}' ) )
            // InternalAle.g:347:2: (otherlv_0= 'open' otherlv_1= 'class' ( (lv_name_2_0= rulerQualified ) ) (otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )* )? otherlv_7= '{' ( (lv_attributes_8_0= rulerAttribute ) )* ( (lv_operations_9_0= rulerOperation ) )* otherlv_10= '}' )
            {
            // InternalAle.g:347:2: (otherlv_0= 'open' otherlv_1= 'class' ( (lv_name_2_0= rulerQualified ) ) (otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )* )? otherlv_7= '{' ( (lv_attributes_8_0= rulerAttribute ) )* ( (lv_operations_9_0= rulerOperation ) )* otherlv_10= '}' )
            // InternalAle.g:348:3: otherlv_0= 'open' otherlv_1= 'class' ( (lv_name_2_0= rulerQualified ) ) (otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )* )? otherlv_7= '{' ( (lv_attributes_8_0= rulerAttribute ) )* ( (lv_operations_9_0= rulerOperation ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getROpenClassAccess().getOpenKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getROpenClassAccess().getClassKeyword_1());
              		
            }
            // InternalAle.g:356:3: ( (lv_name_2_0= rulerQualified ) )
            // InternalAle.g:357:4: (lv_name_2_0= rulerQualified )
            {
            // InternalAle.g:357:4: (lv_name_2_0= rulerQualified )
            // InternalAle.g:358:5: lv_name_2_0= rulerQualified
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getROpenClassAccess().getNameRQualifiedParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_name_2_0=rulerQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getROpenClassRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.ecoretools.Ale.rQualified");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:375:3: (otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAle.g:376:4: otherlv_3= 'extends' rulerQualified (otherlv_5= ',' rulerQualified )*
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getROpenClassAccess().getExtendsKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getROpenClassAccess().getRQualifiedParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    rulerQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAle.g:390:4: (otherlv_5= ',' rulerQualified )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAle.g:391:5: otherlv_5= ',' rulerQualified
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getROpenClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getROpenClassAccess().getRQualifiedParserRuleCall_3_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    rulerQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getROpenClassAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalAle.g:411:3: ( (lv_attributes_8_0= rulerAttribute ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENT||LA8_0==25||(LA8_0>=78 && LA8_0<=83)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAle.g:412:4: (lv_attributes_8_0= rulerAttribute )
            	    {
            	    // InternalAle.g:412:4: (lv_attributes_8_0= rulerAttribute )
            	    // InternalAle.g:413:5: lv_attributes_8_0= rulerAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getROpenClassAccess().getAttributesRAttributeParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_attributes_8_0=rulerAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getROpenClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_8_0,
            	      						"org.eclipse.ecoretools.Ale.rAttribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalAle.g:430:3: ( (lv_operations_9_0= rulerOperation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=27 && LA9_0<=28)||LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAle.g:431:4: (lv_operations_9_0= rulerOperation )
            	    {
            	    // InternalAle.g:431:4: (lv_operations_9_0= rulerOperation )
            	    // InternalAle.g:432:5: lv_operations_9_0= rulerOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getROpenClassAccess().getOperationsROperationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operations_9_0=rulerOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getROpenClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"operations",
            	      						lv_operations_9_0,
            	      						"org.eclipse.ecoretools.Ale.rOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getROpenClassAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerOpenClass"


    // $ANTLR start "entryRulerNewClass"
    // InternalAle.g:457:1: entryRulerNewClass returns [EObject current=null] : iv_rulerNewClass= rulerNewClass EOF ;
    public final EObject entryRulerNewClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerNewClass = null;


        try {
            // InternalAle.g:457:50: (iv_rulerNewClass= rulerNewClass EOF )
            // InternalAle.g:458:2: iv_rulerNewClass= rulerNewClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRNewClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerNewClass=rulerNewClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerNewClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerNewClass"


    // $ANTLR start "rulerNewClass"
    // InternalAle.g:464:1: rulerNewClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= rulerQualified ) ) otherlv_2= '{' ( (lv_attributes_3_0= rulerAttribute ) )* ( (lv_operations_4_0= rulerOperation ) )* otherlv_5= '}' ) ;
    public final EObject rulerNewClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_operations_4_0 = null;



        	enterRule();

        try {
            // InternalAle.g:470:2: ( (otherlv_0= 'class' ( (lv_name_1_0= rulerQualified ) ) otherlv_2= '{' ( (lv_attributes_3_0= rulerAttribute ) )* ( (lv_operations_4_0= rulerOperation ) )* otherlv_5= '}' ) )
            // InternalAle.g:471:2: (otherlv_0= 'class' ( (lv_name_1_0= rulerQualified ) ) otherlv_2= '{' ( (lv_attributes_3_0= rulerAttribute ) )* ( (lv_operations_4_0= rulerOperation ) )* otherlv_5= '}' )
            {
            // InternalAle.g:471:2: (otherlv_0= 'class' ( (lv_name_1_0= rulerQualified ) ) otherlv_2= '{' ( (lv_attributes_3_0= rulerAttribute ) )* ( (lv_operations_4_0= rulerOperation ) )* otherlv_5= '}' )
            // InternalAle.g:472:3: otherlv_0= 'class' ( (lv_name_1_0= rulerQualified ) ) otherlv_2= '{' ( (lv_attributes_3_0= rulerAttribute ) )* ( (lv_operations_4_0= rulerOperation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRNewClassAccess().getClassKeyword_0());
              		
            }
            // InternalAle.g:476:3: ( (lv_name_1_0= rulerQualified ) )
            // InternalAle.g:477:4: (lv_name_1_0= rulerQualified )
            {
            // InternalAle.g:477:4: (lv_name_1_0= rulerQualified )
            // InternalAle.g:478:5: lv_name_1_0= rulerQualified
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRNewClassAccess().getNameRQualifiedParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=rulerQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRNewClassRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.ecoretools.Ale.rQualified");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRNewClassAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAle.g:499:3: ( (lv_attributes_3_0= rulerAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IDENT||LA10_0==25||(LA10_0>=78 && LA10_0<=83)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAle.g:500:4: (lv_attributes_3_0= rulerAttribute )
            	    {
            	    // InternalAle.g:500:4: (lv_attributes_3_0= rulerAttribute )
            	    // InternalAle.g:501:5: lv_attributes_3_0= rulerAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRNewClassAccess().getAttributesRAttributeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_attributes_3_0=rulerAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRNewClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_3_0,
            	      						"org.eclipse.ecoretools.Ale.rAttribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalAle.g:518:3: ( (lv_operations_4_0= rulerOperation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)||LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAle.g:519:4: (lv_operations_4_0= rulerOperation )
            	    {
            	    // InternalAle.g:519:4: (lv_operations_4_0= rulerOperation )
            	    // InternalAle.g:520:5: lv_operations_4_0= rulerOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRNewClassAccess().getOperationsROperationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operations_4_0=rulerOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRNewClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"operations",
            	      						lv_operations_4_0,
            	      						"org.eclipse.ecoretools.Ale.rOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRNewClassAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerNewClass"


    // $ANTLR start "entryRulerOperation"
    // InternalAle.g:545:1: entryRulerOperation returns [EObject current=null] : iv_rulerOperation= rulerOperation EOF ;
    public final EObject entryRulerOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerOperation = null;


        try {
            // InternalAle.g:545:51: (iv_rulerOperation= rulerOperation EOF )
            // InternalAle.g:546:2: iv_rulerOperation= rulerOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getROperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerOperation=rulerOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerOperation"


    // $ANTLR start "rulerOperation"
    // InternalAle.g:552:1: rulerOperation returns [EObject current=null] : ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= rulerType ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) ) ;
    public final EObject rulerOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_paramList_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:558:2: ( ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= rulerType ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) ) )
            // InternalAle.g:559:2: ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= rulerType ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) )
            {
            // InternalAle.g:559:2: ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= rulerType ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) )
            // InternalAle.g:560:3: ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= rulerType ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) )
            {
            // InternalAle.g:560:3: ( rulerTag )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAle.g:561:4: rulerTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getROperationAccess().getRTagParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    rulerTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalAle.g:572:3: (otherlv_1= 'def' | otherlv_2= 'override' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAle.g:573:4: otherlv_1= 'def'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getROperationAccess().getDefKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:578:4: otherlv_2= 'override'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getROperationAccess().getOverrideKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:583:3: ( (lv_type_3_0= rulerType ) )
            // InternalAle.g:584:4: (lv_type_3_0= rulerType )
            {
            // InternalAle.g:584:4: (lv_type_3_0= rulerType )
            // InternalAle.g:585:5: lv_type_3_0= rulerType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getROperationAccess().getTypeRTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_3_0=rulerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getROperationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.eclipse.ecoretools.Ale.rType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:602:3: ( (lv_name_4_0= RULE_IDENT ) )
            // InternalAle.g:603:4: (lv_name_4_0= RULE_IDENT )
            {
            // InternalAle.g:603:4: (lv_name_4_0= RULE_IDENT )
            // InternalAle.g:604:5: lv_name_4_0= RULE_IDENT
            {
            lv_name_4_0=(Token)match(input,RULE_IDENT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getROperationAccess().getNameIdentTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getROperationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.ecoretools.Ale.Ident");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getROperationAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalAle.g:624:3: ( (lv_paramList_6_0= rulerParameters ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENT||LA14_0==25||(LA14_0>=78 && LA14_0<=83)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAle.g:625:4: (lv_paramList_6_0= rulerParameters )
                    {
                    // InternalAle.g:625:4: (lv_paramList_6_0= rulerParameters )
                    // InternalAle.g:626:5: lv_paramList_6_0= rulerParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getROperationAccess().getParamListRParametersParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_paramList_6_0=rulerParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getROperationRule());
                      					}
                      					add(
                      						current,
                      						"paramList",
                      						lv_paramList_6_0,
                      						"org.eclipse.ecoretools.Ale.rParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getROperationAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalAle.g:647:3: ( (lv_body_8_0= rulerBlock ) )
            // InternalAle.g:648:4: (lv_body_8_0= rulerBlock )
            {
            // InternalAle.g:648:4: (lv_body_8_0= rulerBlock )
            // InternalAle.g:649:5: lv_body_8_0= rulerBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getROperationAccess().getBodyRBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_8_0=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getROperationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
              						"org.eclipse.ecoretools.Ale.rBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerOperation"


    // $ANTLR start "entryRulerTag"
    // InternalAle.g:670:1: entryRulerTag returns [String current=null] : iv_rulerTag= rulerTag EOF ;
    public final String entryRulerTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerTag = null;


        try {
            // InternalAle.g:670:44: (iv_rulerTag= rulerTag EOF )
            // InternalAle.g:671:2: iv_rulerTag= rulerTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerTag=rulerTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerTag.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerTag"


    // $ANTLR start "rulerTag"
    // InternalAle.g:677:1: rulerTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_Ident_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulerTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_1=null;


        	enterRule();

        try {
            // InternalAle.g:683:2: ( (kw= '@' this_Ident_1= RULE_IDENT ) )
            // InternalAle.g:684:2: (kw= '@' this_Ident_1= RULE_IDENT )
            {
            // InternalAle.g:684:2: (kw= '@' this_Ident_1= RULE_IDENT )
            // InternalAle.g:685:3: kw= '@' this_Ident_1= RULE_IDENT
            {
            kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRTagAccess().getCommercialAtKeyword_0());
              		
            }
            this_Ident_1=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_1, grammarAccess.getRTagAccess().getIdentTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerTag"


    // $ANTLR start "entryRulerParameters"
    // InternalAle.g:701:1: entryRulerParameters returns [EObject current=null] : iv_rulerParameters= rulerParameters EOF ;
    public final EObject entryRulerParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerParameters = null;


        try {
            // InternalAle.g:701:52: (iv_rulerParameters= rulerParameters EOF )
            // InternalAle.g:702:2: iv_rulerParameters= rulerParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerParameters=rulerParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerParameters"


    // $ANTLR start "rulerParameters"
    // InternalAle.g:708:1: rulerParameters returns [EObject current=null] : ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* ) ;
    public final EObject rulerParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:714:2: ( ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* ) )
            // InternalAle.g:715:2: ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* )
            {
            // InternalAle.g:715:2: ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* )
            // InternalAle.g:716:3: ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )*
            {
            // InternalAle.g:716:3: ( (lv_params_0_0= rulerVariable ) )
            // InternalAle.g:717:4: (lv_params_0_0= rulerVariable )
            {
            // InternalAle.g:717:4: (lv_params_0_0= rulerVariable )
            // InternalAle.g:718:5: lv_params_0_0= rulerVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_params_0_0=rulerVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRParametersRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_0_0,
              						"org.eclipse.ecoretools.Ale.rVariable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:735:3: (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAle.g:736:4: otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getRParametersAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAle.g:740:4: ( (lv_params_2_0= rulerVariable ) )
            	    // InternalAle.g:741:5: (lv_params_2_0= rulerVariable )
            	    {
            	    // InternalAle.g:741:5: (lv_params_2_0= rulerVariable )
            	    // InternalAle.g:742:6: lv_params_2_0= rulerVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_params_2_0=rulerVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRParametersRule());
            	      						}
            	      						add(
            	      							current,
            	      							"params",
            	      							lv_params_2_0,
            	      							"org.eclipse.ecoretools.Ale.rVariable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerParameters"


    // $ANTLR start "entryRulerVariable"
    // InternalAle.g:764:1: entryRulerVariable returns [EObject current=null] : iv_rulerVariable= rulerVariable EOF ;
    public final EObject entryRulerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerVariable = null;


        try {
            // InternalAle.g:764:50: (iv_rulerVariable= rulerVariable EOF )
            // InternalAle.g:765:2: iv_rulerVariable= rulerVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerVariable=rulerVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerVariable"


    // $ANTLR start "rulerVariable"
    // InternalAle.g:771:1: rulerVariable returns [EObject current=null] : ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulerVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:777:2: ( ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) ) )
            // InternalAle.g:778:2: ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) )
            {
            // InternalAle.g:778:2: ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) )
            // InternalAle.g:779:3: ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) )
            {
            // InternalAle.g:779:3: ( (lv_type_0_0= rulerType ) )
            // InternalAle.g:780:4: (lv_type_0_0= rulerType )
            {
            // InternalAle.g:780:4: (lv_type_0_0= rulerType )
            // InternalAle.g:781:5: lv_type_0_0= rulerType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRVariableAccess().getTypeRTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=rulerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRVariableRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.eclipse.ecoretools.Ale.rType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:798:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalAle.g:799:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalAle.g:799:4: (lv_name_1_0= RULE_IDENT )
            // InternalAle.g:800:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRVariableAccess().getNameIdentTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.ecoretools.Ale.Ident");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerVariable"


    // $ANTLR start "entryRulerAttribute"
    // InternalAle.g:820:1: entryRulerAttribute returns [EObject current=null] : iv_rulerAttribute= rulerAttribute EOF ;
    public final EObject entryRulerAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerAttribute = null;


        try {
            // InternalAle.g:820:51: (iv_rulerAttribute= rulerAttribute EOF )
            // InternalAle.g:821:2: iv_rulerAttribute= rulerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerAttribute=rulerAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerAttribute"


    // $ANTLR start "rulerAttribute"
    // InternalAle.g:827:1: rulerAttribute returns [EObject current=null] : ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) ) )? otherlv_4= ';' ) ;
    public final EObject rulerAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:833:2: ( ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) ) )? otherlv_4= ';' ) )
            // InternalAle.g:834:2: ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) ) )? otherlv_4= ';' )
            {
            // InternalAle.g:834:2: ( ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) ) )? otherlv_4= ';' )
            // InternalAle.g:835:3: ( (lv_type_0_0= rulerType ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) ) )? otherlv_4= ';'
            {
            // InternalAle.g:835:3: ( (lv_type_0_0= rulerType ) )
            // InternalAle.g:836:4: (lv_type_0_0= rulerType )
            {
            // InternalAle.g:836:4: (lv_type_0_0= rulerType )
            // InternalAle.g:837:5: lv_type_0_0= rulerType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRAttributeAccess().getTypeRTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=rulerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRAttributeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.eclipse.ecoretools.Ale.rType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:854:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalAle.g:855:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalAle.g:855:4: (lv_name_1_0= RULE_IDENT )
            // InternalAle.g:856:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRAttributeAccess().getNameIdentTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.ecoretools.Ale.Ident");
              				
            }

            }


            }

            // InternalAle.g:872:3: (otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAle.g:873:4: otherlv_2= ':=' ( (lv_expr_3_0= ruleexpression ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRAttributeAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalAle.g:877:4: ( (lv_expr_3_0= ruleexpression ) )
                    // InternalAle.g:878:5: (lv_expr_3_0= ruleexpression )
                    {
                    // InternalAle.g:878:5: (lv_expr_3_0= ruleexpression )
                    // InternalAle.g:879:6: lv_expr_3_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRAttributeAccess().getExprExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_expr_3_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRAttributeRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_3_0,
                      							"org.eclipse.ecoretools.Ale.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRAttributeAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerAttribute"


    // $ANTLR start "entryRulerStatement"
    // InternalAle.g:905:1: entryRulerStatement returns [EObject current=null] : iv_rulerStatement= rulerStatement EOF ;
    public final EObject entryRulerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerStatement = null;


        try {
            // InternalAle.g:905:51: (iv_rulerStatement= rulerStatement EOF )
            // InternalAle.g:906:2: iv_rulerStatement= rulerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerStatement=rulerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerStatement"


    // $ANTLR start "rulerStatement"
    // InternalAle.g:912:1: rulerStatement returns [EObject current=null] : ( ( () ( (lv_stmt_1_0= rulerVarDecl ) ) ) | ( () ( (lv_stmt_3_0= rulerAssign ) ) ) | ( () ( (lv_forEach_5_0= rulerForEach ) ) ) | ( () ( (lv_while_7_0= rulerWhile ) ) ) | ( () ( (lv_if_9_0= rulerIf ) ) ) | ( () ( (lv_expr_11_0= rulerExpression ) ) ) ) ;
    public final EObject rulerStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_stmt_1_0 = null;

        EObject lv_stmt_3_0 = null;

        EObject lv_forEach_5_0 = null;

        EObject lv_while_7_0 = null;

        EObject lv_if_9_0 = null;

        EObject lv_expr_11_0 = null;



        	enterRule();

        try {
            // InternalAle.g:918:2: ( ( ( () ( (lv_stmt_1_0= rulerVarDecl ) ) ) | ( () ( (lv_stmt_3_0= rulerAssign ) ) ) | ( () ( (lv_forEach_5_0= rulerForEach ) ) ) | ( () ( (lv_while_7_0= rulerWhile ) ) ) | ( () ( (lv_if_9_0= rulerIf ) ) ) | ( () ( (lv_expr_11_0= rulerExpression ) ) ) ) )
            // InternalAle.g:919:2: ( ( () ( (lv_stmt_1_0= rulerVarDecl ) ) ) | ( () ( (lv_stmt_3_0= rulerAssign ) ) ) | ( () ( (lv_forEach_5_0= rulerForEach ) ) ) | ( () ( (lv_while_7_0= rulerWhile ) ) ) | ( () ( (lv_if_9_0= rulerIf ) ) ) | ( () ( (lv_expr_11_0= rulerExpression ) ) ) )
            {
            // InternalAle.g:919:2: ( ( () ( (lv_stmt_1_0= rulerVarDecl ) ) ) | ( () ( (lv_stmt_3_0= rulerAssign ) ) ) | ( () ( (lv_forEach_5_0= rulerForEach ) ) ) | ( () ( (lv_while_7_0= rulerWhile ) ) ) | ( () ( (lv_if_9_0= rulerIf ) ) ) | ( () ( (lv_expr_11_0= rulerExpression ) ) ) )
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalAle.g:920:3: ( () ( (lv_stmt_1_0= rulerVarDecl ) ) )
                    {
                    // InternalAle.g:920:3: ( () ( (lv_stmt_1_0= rulerVarDecl ) ) )
                    // InternalAle.g:921:4: () ( (lv_stmt_1_0= rulerVarDecl ) )
                    {
                    // InternalAle.g:921:4: ()
                    // InternalAle.g:922:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRStatementAccess().getRValDeclAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:931:4: ( (lv_stmt_1_0= rulerVarDecl ) )
                    // InternalAle.g:932:5: (lv_stmt_1_0= rulerVarDecl )
                    {
                    // InternalAle.g:932:5: (lv_stmt_1_0= rulerVarDecl )
                    // InternalAle.g:933:6: lv_stmt_1_0= rulerVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRStatementAccess().getStmtRVarDeclParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_stmt_1_0=rulerVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRStatementRule());
                      						}
                      						set(
                      							current,
                      							"stmt",
                      							lv_stmt_1_0,
                      							"org.eclipse.ecoretools.Ale.rVarDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:952:3: ( () ( (lv_stmt_3_0= rulerAssign ) ) )
                    {
                    // InternalAle.g:952:3: ( () ( (lv_stmt_3_0= rulerAssign ) ) )
                    // InternalAle.g:953:4: () ( (lv_stmt_3_0= rulerAssign ) )
                    {
                    // InternalAle.g:953:4: ()
                    // InternalAle.g:954:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRStatementAccess().getRAssignAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:963:4: ( (lv_stmt_3_0= rulerAssign ) )
                    // InternalAle.g:964:5: (lv_stmt_3_0= rulerAssign )
                    {
                    // InternalAle.g:964:5: (lv_stmt_3_0= rulerAssign )
                    // InternalAle.g:965:6: lv_stmt_3_0= rulerAssign
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRStatementAccess().getStmtRAssignParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_stmt_3_0=rulerAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRStatementRule());
                      						}
                      						set(
                      							current,
                      							"stmt",
                      							lv_stmt_3_0,
                      							"org.eclipse.ecoretools.Ale.rAssign");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:984:3: ( () ( (lv_forEach_5_0= rulerForEach ) ) )
                    {
                    // InternalAle.g:984:3: ( () ( (lv_forEach_5_0= rulerForEach ) ) )
                    // InternalAle.g:985:4: () ( (lv_forEach_5_0= rulerForEach ) )
                    {
                    // InternalAle.g:985:4: ()
                    // InternalAle.g:986:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRStatementAccess().getRForEachAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:995:4: ( (lv_forEach_5_0= rulerForEach ) )
                    // InternalAle.g:996:5: (lv_forEach_5_0= rulerForEach )
                    {
                    // InternalAle.g:996:5: (lv_forEach_5_0= rulerForEach )
                    // InternalAle.g:997:6: lv_forEach_5_0= rulerForEach
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRStatementAccess().getForEachRForEachParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_forEach_5_0=rulerForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRStatementRule());
                      						}
                      						set(
                      							current,
                      							"forEach",
                      							lv_forEach_5_0,
                      							"org.eclipse.ecoretools.Ale.rForEach");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1016:3: ( () ( (lv_while_7_0= rulerWhile ) ) )
                    {
                    // InternalAle.g:1016:3: ( () ( (lv_while_7_0= rulerWhile ) ) )
                    // InternalAle.g:1017:4: () ( (lv_while_7_0= rulerWhile ) )
                    {
                    // InternalAle.g:1017:4: ()
                    // InternalAle.g:1018:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRStatementAccess().getRWhileAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1027:4: ( (lv_while_7_0= rulerWhile ) )
                    // InternalAle.g:1028:5: (lv_while_7_0= rulerWhile )
                    {
                    // InternalAle.g:1028:5: (lv_while_7_0= rulerWhile )
                    // InternalAle.g:1029:6: lv_while_7_0= rulerWhile
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRStatementAccess().getWhileRWhileParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_while_7_0=rulerWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRStatementRule());
                      						}
                      						set(
                      							current,
                      							"while",
                      							lv_while_7_0,
                      							"org.eclipse.ecoretools.Ale.rWhile");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1048:3: ( () ( (lv_if_9_0= rulerIf ) ) )
                    {
                    // InternalAle.g:1048:3: ( () ( (lv_if_9_0= rulerIf ) ) )
                    // InternalAle.g:1049:4: () ( (lv_if_9_0= rulerIf ) )
                    {
                    // InternalAle.g:1049:4: ()
                    // InternalAle.g:1050:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRStatementAccess().getRIfAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1059:4: ( (lv_if_9_0= rulerIf ) )
                    // InternalAle.g:1060:5: (lv_if_9_0= rulerIf )
                    {
                    // InternalAle.g:1060:5: (lv_if_9_0= rulerIf )
                    // InternalAle.g:1061:6: lv_if_9_0= rulerIf
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRStatementAccess().getIfRIfParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_if_9_0=rulerIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRStatementRule());
                      						}
                      						set(
                      							current,
                      							"if",
                      							lv_if_9_0,
                      							"org.eclipse.ecoretools.Ale.rIf");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1080:3: ( () ( (lv_expr_11_0= rulerExpression ) ) )
                    {
                    // InternalAle.g:1080:3: ( () ( (lv_expr_11_0= rulerExpression ) ) )
                    // InternalAle.g:1081:4: () ( (lv_expr_11_0= rulerExpression ) )
                    {
                    // InternalAle.g:1081:4: ()
                    // InternalAle.g:1082:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRStatementAccess().getRExpressionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1091:4: ( (lv_expr_11_0= rulerExpression ) )
                    // InternalAle.g:1092:5: (lv_expr_11_0= rulerExpression )
                    {
                    // InternalAle.g:1092:5: (lv_expr_11_0= rulerExpression )
                    // InternalAle.g:1093:6: lv_expr_11_0= rulerExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRStatementAccess().getExprRExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_11_0=rulerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRStatementRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_11_0,
                      							"org.eclipse.ecoretools.Ale.rExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerStatement"


    // $ANTLR start "entryRulerVarDecl"
    // InternalAle.g:1115:1: entryRulerVarDecl returns [EObject current=null] : iv_rulerVarDecl= rulerVarDecl EOF ;
    public final EObject entryRulerVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerVarDecl = null;


        try {
            // InternalAle.g:1115:49: (iv_rulerVarDecl= rulerVarDecl EOF )
            // InternalAle.g:1116:2: iv_rulerVarDecl= rulerVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerVarDecl=rulerVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerVarDecl"


    // $ANTLR start "rulerVarDecl"
    // InternalAle.g:1122:1: rulerVarDecl returns [EObject current=null] : ( rulerType this_Ident_1= RULE_IDENT (otherlv_2= ':=' this_expression_3= ruleexpression )? otherlv_4= ';' ) ;
    public final EObject rulerVarDecl() throws RecognitionException {
        EObject current = null;

        Token this_Ident_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_expression_3 = null;



        	enterRule();

        try {
            // InternalAle.g:1128:2: ( ( rulerType this_Ident_1= RULE_IDENT (otherlv_2= ':=' this_expression_3= ruleexpression )? otherlv_4= ';' ) )
            // InternalAle.g:1129:2: ( rulerType this_Ident_1= RULE_IDENT (otherlv_2= ':=' this_expression_3= ruleexpression )? otherlv_4= ';' )
            {
            // InternalAle.g:1129:2: ( rulerType this_Ident_1= RULE_IDENT (otherlv_2= ':=' this_expression_3= ruleexpression )? otherlv_4= ';' )
            // InternalAle.g:1130:3: rulerType this_Ident_1= RULE_IDENT (otherlv_2= ':=' this_expression_3= ruleexpression )? otherlv_4= ';'
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRVarDeclAccess().getRTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            rulerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_Ident_1=(Token)match(input,RULE_IDENT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_1, grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_1());
              		
            }
            // InternalAle.g:1144:3: (otherlv_2= ':=' this_expression_3= ruleexpression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAle.g:1145:4: otherlv_2= ':=' this_expression_3= ruleexpression
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRVarDeclAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRVarDeclAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRVarDeclAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerVarDecl"


    // $ANTLR start "entryRulerAssign"
    // InternalAle.g:1169:1: entryRulerAssign returns [EObject current=null] : iv_rulerAssign= rulerAssign EOF ;
    public final EObject entryRulerAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerAssign = null;


        try {
            // InternalAle.g:1169:48: (iv_rulerAssign= rulerAssign EOF )
            // InternalAle.g:1170:2: iv_rulerAssign= rulerAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerAssign=rulerAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerAssign"


    // $ANTLR start "rulerAssign"
    // InternalAle.g:1176:1: rulerAssign returns [EObject current=null] : ( ( (lv_left_0_0= ruleexpression ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleexpression ) ) otherlv_3= ';' ) ;
    public final EObject rulerAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1182:2: ( ( ( (lv_left_0_0= ruleexpression ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleexpression ) ) otherlv_3= ';' ) )
            // InternalAle.g:1183:2: ( ( (lv_left_0_0= ruleexpression ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleexpression ) ) otherlv_3= ';' )
            {
            // InternalAle.g:1183:2: ( ( (lv_left_0_0= ruleexpression ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleexpression ) ) otherlv_3= ';' )
            // InternalAle.g:1184:3: ( (lv_left_0_0= ruleexpression ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleexpression ) ) otherlv_3= ';'
            {
            // InternalAle.g:1184:3: ( (lv_left_0_0= ruleexpression ) )
            // InternalAle.g:1185:4: (lv_left_0_0= ruleexpression )
            {
            // InternalAle.g:1185:4: (lv_left_0_0= ruleexpression )
            // InternalAle.g:1186:5: lv_left_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRAssignAccess().getLeftExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_left_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRAssignRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"org.eclipse.ecoretools.Ale.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRAssignAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalAle.g:1207:3: ( (lv_right_2_0= ruleexpression ) )
            // InternalAle.g:1208:4: (lv_right_2_0= ruleexpression )
            {
            // InternalAle.g:1208:4: (lv_right_2_0= ruleexpression )
            // InternalAle.g:1209:5: lv_right_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRAssignAccess().getRightExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_right_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRAssignRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"org.eclipse.ecoretools.Ale.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRAssignAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerAssign"


    // $ANTLR start "entryRulerForEach"
    // InternalAle.g:1234:1: entryRulerForEach returns [EObject current=null] : iv_rulerForEach= rulerForEach EOF ;
    public final EObject entryRulerForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerForEach = null;


        try {
            // InternalAle.g:1234:49: (iv_rulerForEach= rulerForEach EOF )
            // InternalAle.g:1235:2: iv_rulerForEach= rulerForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRForEachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerForEach=rulerForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerForEach; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerForEach"


    // $ANTLR start "rulerForEach"
    // InternalAle.g:1241:1: rulerForEach returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' this_Ident_2= RULE_IDENT otherlv_3= 'in' this_rCollection_4= rulerCollection otherlv_5= ')' ( (lv_block_6_0= rulerBlock ) ) ) ;
    public final EObject rulerForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_Ident_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_rCollection_4 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1247:2: ( (otherlv_0= 'for' otherlv_1= '(' this_Ident_2= RULE_IDENT otherlv_3= 'in' this_rCollection_4= rulerCollection otherlv_5= ')' ( (lv_block_6_0= rulerBlock ) ) ) )
            // InternalAle.g:1248:2: (otherlv_0= 'for' otherlv_1= '(' this_Ident_2= RULE_IDENT otherlv_3= 'in' this_rCollection_4= rulerCollection otherlv_5= ')' ( (lv_block_6_0= rulerBlock ) ) )
            {
            // InternalAle.g:1248:2: (otherlv_0= 'for' otherlv_1= '(' this_Ident_2= RULE_IDENT otherlv_3= 'in' this_rCollection_4= rulerCollection otherlv_5= ')' ( (lv_block_6_0= rulerBlock ) ) )
            // InternalAle.g:1249:3: otherlv_0= 'for' otherlv_1= '(' this_Ident_2= RULE_IDENT otherlv_3= 'in' this_rCollection_4= rulerCollection otherlv_5= ')' ( (lv_block_6_0= rulerBlock ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRForEachAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRForEachAccess().getLeftParenthesisKeyword_1());
              		
            }
            this_Ident_2=(Token)match(input,RULE_IDENT,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_2, grammarAccess.getRForEachAccess().getIdentTerminalRuleCall_2());
              		
            }
            otherlv_3=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRForEachAccess().getInKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRForEachAccess().getRCollectionParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_20);
            this_rCollection_4=rulerCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_rCollection_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRForEachAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalAle.g:1280:3: ( (lv_block_6_0= rulerBlock ) )
            // InternalAle.g:1281:4: (lv_block_6_0= rulerBlock )
            {
            // InternalAle.g:1281:4: (lv_block_6_0= rulerBlock )
            // InternalAle.g:1282:5: lv_block_6_0= rulerBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRForEachAccess().getBlockRBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_6_0=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRForEachRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_6_0,
              						"org.eclipse.ecoretools.Ale.rBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerForEach"


    // $ANTLR start "entryRulerCollection"
    // InternalAle.g:1303:1: entryRulerCollection returns [EObject current=null] : iv_rulerCollection= rulerCollection EOF ;
    public final EObject entryRulerCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerCollection = null;


        try {
            // InternalAle.g:1303:52: (iv_rulerCollection= rulerCollection EOF )
            // InternalAle.g:1304:2: iv_rulerCollection= rulerCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerCollection=rulerCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerCollection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerCollection"


    // $ANTLR start "rulerCollection"
    // InternalAle.g:1310:1: rulerCollection returns [EObject current=null] : ( (otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']' ) | this_expression_5= ruleexpression ) ;
    public final EObject rulerCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token otherlv_4=null;
        EObject this_expression_5 = null;



        	enterRule();

        try {
            // InternalAle.g:1316:2: ( ( (otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']' ) | this_expression_5= ruleexpression ) )
            // InternalAle.g:1317:2: ( (otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']' ) | this_expression_5= ruleexpression )
            {
            // InternalAle.g:1317:2: ( (otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']' ) | this_expression_5= ruleexpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_IDENT && LA19_0<=RULE_INT)||(LA19_0>=RULE_STRING && LA19_0<=RULE_REAL)||LA19_0==25||LA19_0==29||LA19_0==38||(LA19_0>=46 && LA19_0<=47)||LA19_0==50||(LA19_0>=72 && LA19_0<=76)||(LA19_0>=78 && LA19_0<=83)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAle.g:1318:3: (otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']' )
                    {
                    // InternalAle.g:1318:3: (otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']' )
                    // InternalAle.g:1319:4: otherlv_0= '[' this_INT_1= RULE_INT otherlv_2= '..' this_INT_3= RULE_INT otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getRCollectionAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRCollectionAccess().getFullStopFullStopKeyword_0_2());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_3());
                      			
                    }
                    otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRCollectionAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1341:3: this_expression_5= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRCollectionAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_5=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_expression_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerCollection"


    // $ANTLR start "entryRulerBlock"
    // InternalAle.g:1356:1: entryRulerBlock returns [EObject current=null] : iv_rulerBlock= rulerBlock EOF ;
    public final EObject entryRulerBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerBlock = null;


        try {
            // InternalAle.g:1356:47: (iv_rulerBlock= rulerBlock EOF )
            // InternalAle.g:1357:2: iv_rulerBlock= rulerBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerBlock=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerBlock"


    // $ANTLR start "rulerBlock"
    // InternalAle.g:1363:1: rulerBlock returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )* )? otherlv_3= '}' ) ;
    public final EObject rulerBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statement_1_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1369:2: ( (otherlv_0= '{' ( ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )* )? otherlv_3= '}' ) )
            // InternalAle.g:1370:2: (otherlv_0= '{' ( ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )* )? otherlv_3= '}' )
            {
            // InternalAle.g:1370:2: (otherlv_0= '{' ( ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )* )? otherlv_3= '}' )
            // InternalAle.g:1371:3: otherlv_0= '{' ( ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )* )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAle.g:1375:3: ( ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_IDENT && LA21_0<=RULE_INT)||(LA21_0>=RULE_STRING && LA21_0<=RULE_REAL)||LA21_0==25||LA21_0==29||LA21_0==33||LA21_0==38||LA21_0==40||(LA21_0>=46 && LA21_0<=47)||LA21_0==50||(LA21_0>=72 && LA21_0<=76)||(LA21_0>=78 && LA21_0<=83)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAle.g:1376:4: ( (lv_statement_1_0= rulerStatement ) ) ( (lv_statement_2_0= rulerStatement ) )*
                    {
                    // InternalAle.g:1376:4: ( (lv_statement_1_0= rulerStatement ) )
                    // InternalAle.g:1377:5: (lv_statement_1_0= rulerStatement )
                    {
                    // InternalAle.g:1377:5: (lv_statement_1_0= rulerStatement )
                    // InternalAle.g:1378:6: lv_statement_1_0= rulerStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRBlockAccess().getStatementRStatementParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_statement_1_0=rulerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRBlockRule());
                      						}
                      						add(
                      							current,
                      							"statement",
                      							lv_statement_1_0,
                      							"org.eclipse.ecoretools.Ale.rStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:1395:4: ( (lv_statement_2_0= rulerStatement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_IDENT && LA20_0<=RULE_INT)||(LA20_0>=RULE_STRING && LA20_0<=RULE_REAL)||LA20_0==25||LA20_0==29||LA20_0==33||LA20_0==38||LA20_0==40||(LA20_0>=46 && LA20_0<=47)||LA20_0==50||(LA20_0>=72 && LA20_0<=76)||(LA20_0>=78 && LA20_0<=83)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalAle.g:1396:5: (lv_statement_2_0= rulerStatement )
                    	    {
                    	    // InternalAle.g:1396:5: (lv_statement_2_0= rulerStatement )
                    	    // InternalAle.g:1397:6: lv_statement_2_0= rulerStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRBlockAccess().getStatementRStatementParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_statement_2_0=rulerStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRBlockRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"statement",
                    	      							lv_statement_2_0,
                    	      							"org.eclipse.ecoretools.Ale.rStatement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerBlock"


    // $ANTLR start "entryRulerIf"
    // InternalAle.g:1423:1: entryRulerIf returns [EObject current=null] : iv_rulerIf= rulerIf EOF ;
    public final EObject entryRulerIf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerIf = null;


        try {
            // InternalAle.g:1423:44: (iv_rulerIf= rulerIf EOF )
            // InternalAle.g:1424:2: iv_rulerIf= rulerIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerIf=rulerIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerIf"


    // $ANTLR start "rulerIf"
    // InternalAle.g:1430:1: rulerIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= rulerBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) ) )? ) ;
    public final EObject rulerIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1436:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= rulerBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) ) )? ) )
            // InternalAle.g:1437:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= rulerBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) ) )? )
            {
            // InternalAle.g:1437:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= rulerBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) ) )? )
            // InternalAle.g:1438:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleexpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= rulerBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRIfAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRIfAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAle.g:1446:3: ( (lv_condition_2_0= ruleexpression ) )
            // InternalAle.g:1447:4: (lv_condition_2_0= ruleexpression )
            {
            // InternalAle.g:1447:4: (lv_condition_2_0= ruleexpression )
            // InternalAle.g:1448:5: lv_condition_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRIfAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_condition_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRIfRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.eclipse.ecoretools.Ale.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRIfAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAle.g:1469:3: ( (lv_ifBlock_4_0= rulerBlock ) )
            // InternalAle.g:1470:4: (lv_ifBlock_4_0= rulerBlock )
            {
            // InternalAle.g:1470:4: (lv_ifBlock_4_0= rulerBlock )
            // InternalAle.g:1471:5: lv_ifBlock_4_0= rulerBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRIfAccess().getIfBlockRBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_ifBlock_4_0=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRIfRule());
              					}
              					set(
              						current,
              						"ifBlock",
              						lv_ifBlock_4_0,
              						"org.eclipse.ecoretools.Ale.rBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1488:3: (otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAle.g:1489:4: otherlv_5= 'else' ( (lv_elseBlock_6_0= rulerBlock ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getRIfAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalAle.g:1493:4: ( (lv_elseBlock_6_0= rulerBlock ) )
                    // InternalAle.g:1494:5: (lv_elseBlock_6_0= rulerBlock )
                    {
                    // InternalAle.g:1494:5: (lv_elseBlock_6_0= rulerBlock )
                    // InternalAle.g:1495:6: lv_elseBlock_6_0= rulerBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRIfAccess().getElseBlockRBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=rulerBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRIfRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"org.eclipse.ecoretools.Ale.rBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerIf"


    // $ANTLR start "entryRulerWhile"
    // InternalAle.g:1517:1: entryRulerWhile returns [EObject current=null] : iv_rulerWhile= rulerWhile EOF ;
    public final EObject entryRulerWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerWhile = null;


        try {
            // InternalAle.g:1517:47: (iv_rulerWhile= rulerWhile EOF )
            // InternalAle.g:1518:2: iv_rulerWhile= rulerWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerWhile=rulerWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerWhile"


    // $ANTLR start "rulerWhile"
    // InternalAle.g:1524:1: rulerWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ( (lv_block_4_0= rulerBlock ) ) ) ;
    public final EObject rulerWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_expression_2 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1530:2: ( (otherlv_0= 'while' otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ( (lv_block_4_0= rulerBlock ) ) ) )
            // InternalAle.g:1531:2: (otherlv_0= 'while' otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ( (lv_block_4_0= rulerBlock ) ) )
            {
            // InternalAle.g:1531:2: (otherlv_0= 'while' otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ( (lv_block_4_0= rulerBlock ) ) )
            // InternalAle.g:1532:3: otherlv_0= 'while' otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ( (lv_block_4_0= rulerBlock ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRWhileAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_20);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_expression_2;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRWhileAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAle.g:1555:3: ( (lv_block_4_0= rulerBlock ) )
            // InternalAle.g:1556:4: (lv_block_4_0= rulerBlock )
            {
            // InternalAle.g:1556:4: (lv_block_4_0= rulerBlock )
            // InternalAle.g:1557:5: lv_block_4_0= rulerBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRWhileAccess().getBlockRBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_4_0=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRWhileRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_4_0,
              						"org.eclipse.ecoretools.Ale.rBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerWhile"


    // $ANTLR start "entryRulerExpression"
    // InternalAle.g:1578:1: entryRulerExpression returns [EObject current=null] : iv_rulerExpression= rulerExpression EOF ;
    public final EObject entryRulerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerExpression = null;


        try {
            // InternalAle.g:1578:52: (iv_rulerExpression= rulerExpression EOF )
            // InternalAle.g:1579:2: iv_rulerExpression= rulerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerExpression=rulerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerExpression"


    // $ANTLR start "rulerExpression"
    // InternalAle.g:1585:1: rulerExpression returns [EObject current=null] : (this_expression_0= ruleexpression otherlv_1= ';' ) ;
    public final EObject rulerExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_expression_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1591:2: ( (this_expression_0= ruleexpression otherlv_1= ';' ) )
            // InternalAle.g:1592:2: (this_expression_0= ruleexpression otherlv_1= ';' )
            {
            // InternalAle.g:1592:2: (this_expression_0= ruleexpression otherlv_1= ';' )
            // InternalAle.g:1593:3: this_expression_0= ruleexpression otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRExpressionAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_expression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRExpressionAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerExpression"


    // $ANTLR start "entryRuleexpression"
    // InternalAle.g:1612:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalAle.g:1612:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalAle.g:1613:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalAle.g:1619:1: ruleexpression returns [EObject current=null] : ( ( (lv_leftPart_0_0= rulenonLeftRecExpression ) ) ( (lv_recpart_1_0= rulerecExpression ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftPart_0_0 = null;

        EObject lv_recpart_1_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1625:2: ( ( ( (lv_leftPart_0_0= rulenonLeftRecExpression ) ) ( (lv_recpart_1_0= rulerecExpression ) )? ) )
            // InternalAle.g:1626:2: ( ( (lv_leftPart_0_0= rulenonLeftRecExpression ) ) ( (lv_recpart_1_0= rulerecExpression ) )? )
            {
            // InternalAle.g:1626:2: ( ( (lv_leftPart_0_0= rulenonLeftRecExpression ) ) ( (lv_recpart_1_0= rulerecExpression ) )? )
            // InternalAle.g:1627:3: ( (lv_leftPart_0_0= rulenonLeftRecExpression ) ) ( (lv_recpart_1_0= rulerecExpression ) )?
            {
            // InternalAle.g:1627:3: ( (lv_leftPart_0_0= rulenonLeftRecExpression ) )
            // InternalAle.g:1628:4: (lv_leftPart_0_0= rulenonLeftRecExpression )
            {
            // InternalAle.g:1628:4: (lv_leftPart_0_0= rulenonLeftRecExpression )
            // InternalAle.g:1629:5: lv_leftPart_0_0= rulenonLeftRecExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getLeftPartNonLeftRecExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_leftPart_0_0=rulenonLeftRecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"leftPart",
              						lv_leftPart_0_0,
              						"org.eclipse.ecoretools.Ale.nonLeftRecExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1646:3: ( (lv_recpart_1_0= rulerecExpression ) )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalAle.g:1647:4: (lv_recpart_1_0= rulerecExpression )
                    {
                    // InternalAle.g:1647:4: (lv_recpart_1_0= rulerecExpression )
                    // InternalAle.g:1648:5: lv_recpart_1_0= rulerecExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAccess().getRecpartRecExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_recpart_1_0=rulerecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionRule());
                      					}
                      					set(
                      						current,
                      						"recpart",
                      						lv_recpart_1_0,
                      						"org.eclipse.ecoretools.Ale.recExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulerecExpression"
    // InternalAle.g:1669:1: entryRulerecExpression returns [EObject current=null] : iv_rulerecExpression= rulerecExpression EOF ;
    public final EObject entryRulerecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecExpression = null;


        try {
            // InternalAle.g:1669:54: (iv_rulerecExpression= rulerecExpression EOF )
            // InternalAle.g:1670:2: iv_rulerecExpression= rulerecExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecExpression=rulerecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecExpression"


    // $ANTLR start "rulerecExpression"
    // InternalAle.g:1676:1: rulerecExpression returns [EObject current=null] : ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | ( ruleaddOp this_expression_4= ruleexpression ) | ( rulecompOp this_expression_6= ruleexpression ) | (otherlv_7= 'and' this_expression_8= ruleexpression ) | (otherlv_9= 'or' this_expression_10= ruleexpression ) | (otherlv_11= 'xor' this_expression_12= ruleexpression ) | (otherlv_13= 'implies' this_expression_14= ruleexpression ) ) ( (lv_recExp_15_0= rulerecExpression ) )? ) ;
    public final EObject rulerecExpression() throws RecognitionException {
        EObject current = null;

        Token this_MultOp_1=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_navigationSegment_0 = null;

        EObject this_expression_2 = null;

        EObject this_expression_4 = null;

        EObject this_expression_6 = null;

        EObject this_expression_8 = null;

        EObject this_expression_10 = null;

        EObject this_expression_12 = null;

        EObject this_expression_14 = null;

        EObject lv_recExp_15_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1682:2: ( ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | ( ruleaddOp this_expression_4= ruleexpression ) | ( rulecompOp this_expression_6= ruleexpression ) | (otherlv_7= 'and' this_expression_8= ruleexpression ) | (otherlv_9= 'or' this_expression_10= ruleexpression ) | (otherlv_11= 'xor' this_expression_12= ruleexpression ) | (otherlv_13= 'implies' this_expression_14= ruleexpression ) ) ( (lv_recExp_15_0= rulerecExpression ) )? ) )
            // InternalAle.g:1683:2: ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | ( ruleaddOp this_expression_4= ruleexpression ) | ( rulecompOp this_expression_6= ruleexpression ) | (otherlv_7= 'and' this_expression_8= ruleexpression ) | (otherlv_9= 'or' this_expression_10= ruleexpression ) | (otherlv_11= 'xor' this_expression_12= ruleexpression ) | (otherlv_13= 'implies' this_expression_14= ruleexpression ) ) ( (lv_recExp_15_0= rulerecExpression ) )? )
            {
            // InternalAle.g:1683:2: ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | ( ruleaddOp this_expression_4= ruleexpression ) | ( rulecompOp this_expression_6= ruleexpression ) | (otherlv_7= 'and' this_expression_8= ruleexpression ) | (otherlv_9= 'or' this_expression_10= ruleexpression ) | (otherlv_11= 'xor' this_expression_12= ruleexpression ) | (otherlv_13= 'implies' this_expression_14= ruleexpression ) ) ( (lv_recExp_15_0= rulerecExpression ) )? )
            // InternalAle.g:1684:3: (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | ( ruleaddOp this_expression_4= ruleexpression ) | ( rulecompOp this_expression_6= ruleexpression ) | (otherlv_7= 'and' this_expression_8= ruleexpression ) | (otherlv_9= 'or' this_expression_10= ruleexpression ) | (otherlv_11= 'xor' this_expression_12= ruleexpression ) | (otherlv_13= 'implies' this_expression_14= ruleexpression ) ) ( (lv_recExp_15_0= rulerecExpression ) )?
            {
            // InternalAle.g:1684:3: (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | ( ruleaddOp this_expression_4= ruleexpression ) | ( rulecompOp this_expression_6= ruleexpression ) | (otherlv_7= 'and' this_expression_8= ruleexpression ) | (otherlv_9= 'or' this_expression_10= ruleexpression ) | (otherlv_11= 'xor' this_expression_12= ruleexpression ) | (otherlv_13= 'implies' this_expression_14= ruleexpression ) )
            int alt24=8;
            switch ( input.LA(1) ) {
            case 20:
            case 45:
                {
                alt24=1;
                }
                break;
            case RULE_MULTOP:
                {
                alt24=2;
                }
                break;
            case 47:
            case 53:
                {
                alt24=3;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt24=4;
                }
                break;
            case 41:
                {
                alt24=5;
                }
                break;
            case 42:
                {
                alt24=6;
                }
                break;
            case 43:
                {
                alt24=7;
                }
                break;
            case 44:
                {
                alt24=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAle.g:1685:4: this_navigationSegment_0= rulenavigationSegment
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRecExpressionAccess().getNavigationSegmentParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_navigationSegment_0=rulenavigationSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_navigationSegment_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:1697:4: (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression )
                    {
                    // InternalAle.g:1697:4: (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression )
                    // InternalAle.g:1698:5: this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression
                    {
                    this_MultOp_1=(Token)match(input,RULE_MULTOP,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MultOp_1, grammarAccess.getRecExpressionAccess().getMultOpTerminalRuleCall_0_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_1_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_2=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1715:4: ( ruleaddOp this_expression_4= ruleexpression )
                    {
                    // InternalAle.g:1715:4: ( ruleaddOp this_expression_4= ruleexpression )
                    // InternalAle.g:1716:5: ruleaddOp this_expression_4= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getAddOpParserRuleCall_0_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    ruleaddOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_2_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_4=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_4;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1739:4: ( rulecompOp this_expression_6= ruleexpression )
                    {
                    // InternalAle.g:1739:4: ( rulecompOp this_expression_6= ruleexpression )
                    // InternalAle.g:1740:5: rulecompOp this_expression_6= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getCompOpParserRuleCall_0_3_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    rulecompOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_3_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_6=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_6;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1763:4: (otherlv_7= 'and' this_expression_8= ruleexpression )
                    {
                    // InternalAle.g:1763:4: (otherlv_7= 'and' this_expression_8= ruleexpression )
                    // InternalAle.g:1764:5: otherlv_7= 'and' this_expression_8= ruleexpression
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getRecExpressionAccess().getAndKeyword_0_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_4_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_8=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_8;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1781:4: (otherlv_9= 'or' this_expression_10= ruleexpression )
                    {
                    // InternalAle.g:1781:4: (otherlv_9= 'or' this_expression_10= ruleexpression )
                    // InternalAle.g:1782:5: otherlv_9= 'or' this_expression_10= ruleexpression
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getRecExpressionAccess().getOrKeyword_0_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_5_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_10=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_10;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:1799:4: (otherlv_11= 'xor' this_expression_12= ruleexpression )
                    {
                    // InternalAle.g:1799:4: (otherlv_11= 'xor' this_expression_12= ruleexpression )
                    // InternalAle.g:1800:5: otherlv_11= 'xor' this_expression_12= ruleexpression
                    {
                    otherlv_11=(Token)match(input,43,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getRecExpressionAccess().getXorKeyword_0_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_6_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_12=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_12;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:1817:4: (otherlv_13= 'implies' this_expression_14= ruleexpression )
                    {
                    // InternalAle.g:1817:4: (otherlv_13= 'implies' this_expression_14= ruleexpression )
                    // InternalAle.g:1818:5: otherlv_13= 'implies' this_expression_14= ruleexpression
                    {
                    otherlv_13=(Token)match(input,44,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getRecExpressionAccess().getImpliesKeyword_0_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_7_1());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_expression_14=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_expression_14;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAle.g:1835:3: ( (lv_recExp_15_0= rulerecExpression ) )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalAle.g:1836:4: (lv_recExp_15_0= rulerecExpression )
                    {
                    // InternalAle.g:1836:4: (lv_recExp_15_0= rulerecExpression )
                    // InternalAle.g:1837:5: lv_recExp_15_0= rulerecExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getRecExpRecExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_recExp_15_0=rulerecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRecExpressionRule());
                      					}
                      					set(
                      						current,
                      						"recExp",
                      						lv_recExp_15_0,
                      						"org.eclipse.ecoretools.Ale.recExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecExpression"


    // $ANTLR start "entryRulenavigationSegment"
    // InternalAle.g:1858:1: entryRulenavigationSegment returns [EObject current=null] : iv_rulenavigationSegment= rulenavigationSegment EOF ;
    public final EObject entryRulenavigationSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenavigationSegment = null;


        try {
            // InternalAle.g:1858:58: (iv_rulenavigationSegment= rulenavigationSegment EOF )
            // InternalAle.g:1859:2: iv_rulenavigationSegment= rulenavigationSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationSegmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenavigationSegment=rulenavigationSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenavigationSegment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenavigationSegment"


    // $ANTLR start "rulenavigationSegment"
    // InternalAle.g:1865:1: rulenavigationSegment returns [EObject current=null] : ( ( () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) ) ) | ( () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) ) ) | ( () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) ) ) ) ;
    public final EObject rulenavigationSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_ident_2_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_call_5_0 = null;

        EObject lv_call_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1871:2: ( ( ( () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) ) ) | ( () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) ) ) | ( () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) ) ) ) )
            // InternalAle.g:1872:2: ( ( () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) ) ) | ( () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) ) ) | ( () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) ) ) )
            {
            // InternalAle.g:1872:2: ( ( () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) ) ) | ( () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) ) ) | ( () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) ) ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_IDENT) ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3==29) ) {
                        alt26=2;
                    }
                    else if ( (LA26_3==EOF||LA26_3==RULE_MULTOP||LA26_3==16||LA26_3==20||LA26_3==24||LA26_3==26||LA26_3==30||LA26_3==32||LA26_3==34||LA26_3==39||(LA26_3>=41 && LA26_3<=45)||(LA26_3>=47 && LA26_3<=49)||(LA26_3>=52 && LA26_3<=60)) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA26_1>=61 && LA26_1<=70)) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0==45) ) {
                alt26=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAle.g:1873:3: ( () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) ) )
                    {
                    // InternalAle.g:1873:3: ( () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) ) )
                    // InternalAle.g:1874:4: () otherlv_1= '.' ( (lv_ident_2_0= RULE_IDENT ) )
                    {
                    // InternalAle.g:1874:4: ()
                    // InternalAle.g:1875:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNavigationSegmentAccess().getFinalIdentSegmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalAle.g:1888:4: ( (lv_ident_2_0= RULE_IDENT ) )
                    // InternalAle.g:1889:5: (lv_ident_2_0= RULE_IDENT )
                    {
                    // InternalAle.g:1889:5: (lv_ident_2_0= RULE_IDENT )
                    // InternalAle.g:1890:6: lv_ident_2_0= RULE_IDENT
                    {
                    lv_ident_2_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ident_2_0, grammarAccess.getNavigationSegmentAccess().getIdentIdentTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigationSegmentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ident",
                      							lv_ident_2_0,
                      							"org.eclipse.ecoretools.Ale.Ident");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1908:3: ( () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) ) )
                    {
                    // InternalAle.g:1908:3: ( () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) ) )
                    // InternalAle.g:1909:4: () otherlv_4= '.' ( (lv_call_5_0= rulecallExp ) )
                    {
                    // InternalAle.g:1909:4: ()
                    // InternalAle.g:1910:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNavigationSegmentAccess().getFinalIdentCallSegmentAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_1_1());
                      			
                    }
                    // InternalAle.g:1923:4: ( (lv_call_5_0= rulecallExp ) )
                    // InternalAle.g:1924:5: (lv_call_5_0= rulecallExp )
                    {
                    // InternalAle.g:1924:5: (lv_call_5_0= rulecallExp )
                    // InternalAle.g:1925:6: lv_call_5_0= rulecallExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigationSegmentAccess().getCallCallExpParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_call_5_0=rulecallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigationSegmentRule());
                      						}
                      						set(
                      							current,
                      							"call",
                      							lv_call_5_0,
                      							"org.eclipse.ecoretools.Ale.callExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1944:3: ( () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) ) )
                    {
                    // InternalAle.g:1944:3: ( () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) ) )
                    // InternalAle.g:1945:4: () otherlv_7= '->' ( (lv_call_8_0= rulecallExp ) )
                    {
                    // InternalAle.g:1945:4: ()
                    // InternalAle.g:1946:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNavigationSegmentAccess().getFinalCallExpSegmentAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,45,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getNavigationSegmentAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                      			
                    }
                    // InternalAle.g:1959:4: ( (lv_call_8_0= rulecallExp ) )
                    // InternalAle.g:1960:5: (lv_call_8_0= rulecallExp )
                    {
                    // InternalAle.g:1960:5: (lv_call_8_0= rulecallExp )
                    // InternalAle.g:1961:6: lv_call_8_0= rulecallExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigationSegmentAccess().getCallCallExpParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_call_8_0=rulecallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigationSegmentRule());
                      						}
                      						set(
                      							current,
                      							"call",
                      							lv_call_8_0,
                      							"org.eclipse.ecoretools.Ale.callExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenavigationSegment"


    // $ANTLR start "entryRulenonLeftRecExpression"
    // InternalAle.g:1983:1: entryRulenonLeftRecExpression returns [EObject current=null] : iv_rulenonLeftRecExpression= rulenonLeftRecExpression EOF ;
    public final EObject entryRulenonLeftRecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenonLeftRecExpression = null;


        try {
            // InternalAle.g:1983:61: (iv_rulenonLeftRecExpression= rulenonLeftRecExpression EOF )
            // InternalAle.g:1984:2: iv_rulenonLeftRecExpression= rulenonLeftRecExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonLeftRecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenonLeftRecExpression=rulenonLeftRecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenonLeftRecExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenonLeftRecExpression"


    // $ANTLR start "rulenonLeftRecExpression"
    // InternalAle.g:1990:1: rulenonLeftRecExpression returns [EObject current=null] : ( (otherlv_0= 'not' this_expression_1= ruleexpression ) | (otherlv_2= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')' ) | (otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif' ) | (otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) ) ) ) ;
    public final EObject rulenonLeftRecExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_Ident_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject this_expression_1 = null;

        EObject this_expression_3 = null;

        EObject this_literal_5 = null;

        EObject this_expression_7 = null;

        EObject lv_condition_10_0 = null;

        EObject lv_ifBlock_12_0 = null;

        EObject lv_elseBlock_14_0 = null;

        EObject lv_bindings_17_0 = null;

        EObject lv_bindings_19_0 = null;

        EObject lv_letExpr_21_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1996:2: ( ( (otherlv_0= 'not' this_expression_1= ruleexpression ) | (otherlv_2= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')' ) | (otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif' ) | (otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) ) ) ) )
            // InternalAle.g:1997:2: ( (otherlv_0= 'not' this_expression_1= ruleexpression ) | (otherlv_2= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')' ) | (otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif' ) | (otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) ) ) )
            {
            // InternalAle.g:1997:2: ( (otherlv_0= 'not' this_expression_1= ruleexpression ) | (otherlv_2= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')' ) | (otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif' ) | (otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) ) ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt28=1;
                }
                break;
            case 47:
                {
                alt28=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==51||LA28_3==77) ) {
                    alt28=4;
                }
                else if ( (LA28_3==EOF||LA28_3==RULE_MULTOP||LA28_3==16||LA28_3==20||LA28_3==24||LA28_3==26||LA28_3==30||LA28_3==32||LA28_3==34||LA28_3==39||(LA28_3>=41 && LA28_3<=45)||(LA28_3>=47 && LA28_3<=49)||(LA28_3>=52 && LA28_3<=60)) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_REAL:
            case 25:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt28=4;
                }
                break;
            case 29:
                {
                alt28=5;
                }
                break;
            case 38:
                {
                alt28=6;
                }
                break;
            case 50:
                {
                alt28=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAle.g:1998:3: (otherlv_0= 'not' this_expression_1= ruleexpression )
                    {
                    // InternalAle.g:1998:3: (otherlv_0= 'not' this_expression_1= ruleexpression )
                    // InternalAle.g:1999:4: otherlv_0= 'not' this_expression_1= ruleexpression
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getNonLeftRecExpressionAccess().getNotKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2016:3: (otherlv_2= '-' this_expression_3= ruleexpression )
                    {
                    // InternalAle.g:2016:3: (otherlv_2= '-' this_expression_3= ruleexpression )
                    // InternalAle.g:2017:4: otherlv_2= '-' this_expression_3= ruleexpression
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNonLeftRecExpressionAccess().getHyphenMinusKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:2034:3: this_Ident_4= RULE_IDENT
                    {
                    this_Ident_4=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_Ident_4, grammarAccess.getNonLeftRecExpressionAccess().getIdentTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:2039:3: this_literal_5= ruleliteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_literal_5=ruleliteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_literal_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:2051:3: (otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')' )
                    {
                    // InternalAle.g:2051:3: (otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')' )
                    // InternalAle.g:2052:4: otherlv_6= '(' this_expression_7= ruleexpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getNonLeftRecExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_expression_7=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expression_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getNonLeftRecExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2073:3: (otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif' )
                    {
                    // InternalAle.g:2073:3: (otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif' )
                    // InternalAle.g:2074:4: otherlv_9= 'if' ( (lv_condition_10_0= ruleexpression ) ) otherlv_11= 'then' ( (lv_ifBlock_12_0= ruleexpression ) ) otherlv_13= 'else' ( (lv_elseBlock_14_0= ruleexpression ) ) otherlv_15= 'endif'
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNonLeftRecExpressionAccess().getIfKeyword_5_0());
                      			
                    }
                    // InternalAle.g:2078:4: ( (lv_condition_10_0= ruleexpression ) )
                    // InternalAle.g:2079:5: (lv_condition_10_0= ruleexpression )
                    {
                    // InternalAle.g:2079:5: (lv_condition_10_0= ruleexpression )
                    // InternalAle.g:2080:6: lv_condition_10_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getConditionExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_condition_10_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNonLeftRecExpressionRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_10_0,
                      							"org.eclipse.ecoretools.Ale.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,48,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getNonLeftRecExpressionAccess().getThenKeyword_5_2());
                      			
                    }
                    // InternalAle.g:2101:4: ( (lv_ifBlock_12_0= ruleexpression ) )
                    // InternalAle.g:2102:5: (lv_ifBlock_12_0= ruleexpression )
                    {
                    // InternalAle.g:2102:5: (lv_ifBlock_12_0= ruleexpression )
                    // InternalAle.g:2103:6: lv_ifBlock_12_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getIfBlockExpressionParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_ifBlock_12_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNonLeftRecExpressionRule());
                      						}
                      						set(
                      							current,
                      							"ifBlock",
                      							lv_ifBlock_12_0,
                      							"org.eclipse.ecoretools.Ale.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getNonLeftRecExpressionAccess().getElseKeyword_5_4());
                      			
                    }
                    // InternalAle.g:2124:4: ( (lv_elseBlock_14_0= ruleexpression ) )
                    // InternalAle.g:2125:5: (lv_elseBlock_14_0= ruleexpression )
                    {
                    // InternalAle.g:2125:5: (lv_elseBlock_14_0= ruleexpression )
                    // InternalAle.g:2126:6: lv_elseBlock_14_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getElseBlockExpressionParserRuleCall_5_5_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_elseBlock_14_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNonLeftRecExpressionRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_14_0,
                      							"org.eclipse.ecoretools.Ale.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getNonLeftRecExpressionAccess().getEndifKeyword_5_6());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:2149:3: (otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) ) )
                    {
                    // InternalAle.g:2149:3: (otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) ) )
                    // InternalAle.g:2150:4: otherlv_16= 'let' ( (lv_bindings_17_0= rulebinding ) ) (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )* otherlv_20= 'in' ( (lv_letExpr_21_0= ruleexpression ) )
                    {
                    otherlv_16=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getNonLeftRecExpressionAccess().getLetKeyword_6_0());
                      			
                    }
                    // InternalAle.g:2154:4: ( (lv_bindings_17_0= rulebinding ) )
                    // InternalAle.g:2155:5: (lv_bindings_17_0= rulebinding )
                    {
                    // InternalAle.g:2155:5: (lv_bindings_17_0= rulebinding )
                    // InternalAle.g:2156:6: lv_bindings_17_0= rulebinding
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getBindingsBindingParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_bindings_17_0=rulebinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNonLeftRecExpressionRule());
                      						}
                      						add(
                      							current,
                      							"bindings",
                      							lv_bindings_17_0,
                      							"org.eclipse.ecoretools.Ale.binding");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:2173:4: (otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==24) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalAle.g:2174:5: otherlv_18= ',' ( (lv_bindings_19_0= rulebinding ) )
                    	    {
                    	    otherlv_18=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_18, grammarAccess.getNonLeftRecExpressionAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:2178:5: ( (lv_bindings_19_0= rulebinding ) )
                    	    // InternalAle.g:2179:6: (lv_bindings_19_0= rulebinding )
                    	    {
                    	    // InternalAle.g:2179:6: (lv_bindings_19_0= rulebinding )
                    	    // InternalAle.g:2180:7: lv_bindings_19_0= rulebinding
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getBindingsBindingParserRuleCall_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_bindings_19_0=rulebinding();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNonLeftRecExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"bindings",
                    	      								lv_bindings_19_0,
                    	      								"org.eclipse.ecoretools.Ale.binding");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getNonLeftRecExpressionAccess().getInKeyword_6_3());
                      			
                    }
                    // InternalAle.g:2202:4: ( (lv_letExpr_21_0= ruleexpression ) )
                    // InternalAle.g:2203:5: (lv_letExpr_21_0= ruleexpression )
                    {
                    // InternalAle.g:2203:5: (lv_letExpr_21_0= ruleexpression )
                    // InternalAle.g:2204:6: lv_letExpr_21_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getLetExprExpressionParserRuleCall_6_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_letExpr_21_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNonLeftRecExpressionRule());
                      						}
                      						set(
                      							current,
                      							"letExpr",
                      							lv_letExpr_21_0,
                      							"org.eclipse.ecoretools.Ale.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenonLeftRecExpression"


    // $ANTLR start "entryRulebinding"
    // InternalAle.g:2226:1: entryRulebinding returns [EObject current=null] : iv_rulebinding= rulebinding EOF ;
    public final EObject entryRulebinding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebinding = null;


        try {
            // InternalAle.g:2226:48: (iv_rulebinding= rulebinding EOF )
            // InternalAle.g:2227:2: iv_rulebinding= rulebinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebinding=rulebinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebinding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebinding"


    // $ANTLR start "rulebinding"
    // InternalAle.g:2233:1: rulebinding returns [EObject current=null] : (this_Ident_0= RULE_IDENT (otherlv_1= ':' ruletypeLiteral )? otherlv_3= '=' this_expression_4= ruleexpression ) ;
    public final EObject rulebinding() throws RecognitionException {
        EObject current = null;

        Token this_Ident_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_expression_4 = null;



        	enterRule();

        try {
            // InternalAle.g:2239:2: ( (this_Ident_0= RULE_IDENT (otherlv_1= ':' ruletypeLiteral )? otherlv_3= '=' this_expression_4= ruleexpression ) )
            // InternalAle.g:2240:2: (this_Ident_0= RULE_IDENT (otherlv_1= ':' ruletypeLiteral )? otherlv_3= '=' this_expression_4= ruleexpression )
            {
            // InternalAle.g:2240:2: (this_Ident_0= RULE_IDENT (otherlv_1= ':' ruletypeLiteral )? otherlv_3= '=' this_expression_4= ruleexpression )
            // InternalAle.g:2241:3: this_Ident_0= RULE_IDENT (otherlv_1= ':' ruletypeLiteral )? otherlv_3= '=' this_expression_4= ruleexpression
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getBindingAccess().getIdentTerminalRuleCall_0());
              		
            }
            // InternalAle.g:2245:3: (otherlv_1= ':' ruletypeLiteral )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAle.g:2246:4: otherlv_1= ':' ruletypeLiteral
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBindingAccess().getTypeLiteralParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,52,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getEqualsSignKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBindingAccess().getExpressionParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_4=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_expression_4;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebinding"


    // $ANTLR start "entryRuleaddOp"
    // InternalAle.g:2280:1: entryRuleaddOp returns [String current=null] : iv_ruleaddOp= ruleaddOp EOF ;
    public final String entryRuleaddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaddOp = null;


        try {
            // InternalAle.g:2280:45: (iv_ruleaddOp= ruleaddOp EOF )
            // InternalAle.g:2281:2: iv_ruleaddOp= ruleaddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleaddOp=ruleaddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaddOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaddOp"


    // $ANTLR start "ruleaddOp"
    // InternalAle.g:2287:1: ruleaddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleaddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAle.g:2293:2: ( (kw= '+' | kw= '-' ) )
            // InternalAle.g:2294:2: (kw= '+' | kw= '-' )
            {
            // InternalAle.g:2294:2: (kw= '+' | kw= '-' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            else if ( (LA30_0==47) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAle.g:2295:3: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:2301:3: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaddOp"


    // $ANTLR start "entryRulecompOp"
    // InternalAle.g:2310:1: entryRulecompOp returns [String current=null] : iv_rulecompOp= rulecompOp EOF ;
    public final String entryRulecompOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompOp = null;


        try {
            // InternalAle.g:2310:46: (iv_rulecompOp= rulecompOp EOF )
            // InternalAle.g:2311:2: iv_rulecompOp= rulecompOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompOp=rulecompOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompOp"


    // $ANTLR start "rulecompOp"
    // InternalAle.g:2317:1: rulecompOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken rulecompOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAle.g:2323:2: ( (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' ) )
            // InternalAle.g:2324:2: (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' )
            {
            // InternalAle.g:2324:2: (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' )
            int alt31=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt31=1;
                }
                break;
            case 55:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            case 52:
                {
                alt31=5;
                }
                break;
            case 58:
                {
                alt31=6;
                }
                break;
            case 59:
                {
                alt31=7;
                }
                break;
            case 60:
                {
                alt31=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAle.g:2325:3: kw= '<='
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getLessThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:2331:3: kw= '>='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getGreaterThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:2337:3: kw= '!='
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getExclamationMarkEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:2343:3: kw= '<>'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getLessThanSignGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:2349:3: kw= '='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAle.g:2355:3: kw= '=='
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getEqualsSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAle.g:2361:3: kw= '<'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getLessThanSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAle.g:2367:3: kw= '>'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getGreaterThanSignKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompOp"


    // $ANTLR start "entryRulecallExp"
    // InternalAle.g:2376:1: entryRulecallExp returns [EObject current=null] : iv_rulecallExp= rulecallExp EOF ;
    public final EObject entryRulecallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecallExp = null;


        try {
            // InternalAle.g:2376:48: (iv_rulecallExp= rulecallExp EOF )
            // InternalAle.g:2377:2: iv_rulecallExp= rulecallExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecallExp=rulecallExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecallExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecallExp"


    // $ANTLR start "rulecallExp"
    // InternalAle.g:2383:1: rulecallExp returns [EObject current=null] : ( ( rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')' ) | (this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')' ) ) ;
    public final EObject rulecallExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token this_Ident_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_expression_3 = null;

        EObject this_expressionSequence_7 = null;



        	enterRule();

        try {
            // InternalAle.g:2389:2: ( ( ( rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')' ) | (this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')' ) ) )
            // InternalAle.g:2390:2: ( ( rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')' ) | (this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')' ) )
            {
            // InternalAle.g:2390:2: ( ( rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')' ) | (this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=61 && LA32_0<=70)) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_IDENT) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAle.g:2391:3: ( rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')' )
                    {
                    // InternalAle.g:2391:3: ( rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')' )
                    // InternalAle.g:2392:4: rulecollectionIterator otherlv_1= '(' rulevariableDefinition this_expression_3= ruleexpression otherlv_4= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getCollectionIteratorParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    rulecollectionIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getVariableDefinitionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    rulevariableDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getExpressionParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCallExpAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2433:3: (this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')' )
                    {
                    // InternalAle.g:2433:3: (this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')' )
                    // InternalAle.g:2434:4: this_Ident_5= RULE_IDENT otherlv_6= '(' this_expressionSequence_7= ruleexpressionSequence otherlv_8= ')'
                    {
                    this_Ident_5=(Token)match(input,RULE_IDENT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_5, grammarAccess.getCallExpAccess().getIdentTerminalRuleCall_1_0());
                      			
                    }
                    otherlv_6=(Token)match(input,29,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getExpressionSequenceParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_expressionSequence_7=ruleexpressionSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expressionSequence_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCallExpAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecallExp"


    // $ANTLR start "entryRulecollectionIterator"
    // InternalAle.g:2462:1: entryRulecollectionIterator returns [String current=null] : iv_rulecollectionIterator= rulecollectionIterator EOF ;
    public final String entryRulecollectionIterator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecollectionIterator = null;


        try {
            // InternalAle.g:2462:58: (iv_rulecollectionIterator= rulecollectionIterator EOF )
            // InternalAle.g:2463:2: iv_rulecollectionIterator= rulecollectionIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecollectionIterator=rulecollectionIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecollectionIterator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecollectionIterator"


    // $ANTLR start "rulecollectionIterator"
    // InternalAle.g:2469:1: rulecollectionIterator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' ) ;
    public final AntlrDatatypeRuleToken rulecollectionIterator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAle.g:2475:2: ( (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' ) )
            // InternalAle.g:2476:2: (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' )
            {
            // InternalAle.g:2476:2: (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' )
            int alt33=10;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 62:
                {
                alt33=2;
                }
                break;
            case 63:
                {
                alt33=3;
                }
                break;
            case 64:
                {
                alt33=4;
                }
                break;
            case 65:
                {
                alt33=5;
                }
                break;
            case 66:
                {
                alt33=6;
                }
                break;
            case 67:
                {
                alt33=7;
                }
                break;
            case 68:
                {
                alt33=8;
                }
                break;
            case 69:
                {
                alt33=9;
                }
                break;
            case 70:
                {
                alt33=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAle.g:2477:3: kw= 'select'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getSelectKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:2483:3: kw= 'reject'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getRejectKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:2489:3: kw= 'collect'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getCollectKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:2495:3: kw= 'any'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getAnyKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:2501:3: kw= 'exists'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getExistsKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAle.g:2507:3: kw= 'forAll'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getForAllKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAle.g:2513:3: kw= 'isUnique'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getIsUniqueKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAle.g:2519:3: kw= 'one'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getOneKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAle.g:2525:3: kw= 'sortedBy'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getSortedByKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAle.g:2531:3: kw= 'closure'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getClosureKeyword_9());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecollectionIterator"


    // $ANTLR start "entryRuleexpressionSequence"
    // InternalAle.g:2540:1: entryRuleexpressionSequence returns [EObject current=null] : iv_ruleexpressionSequence= ruleexpressionSequence EOF ;
    public final EObject entryRuleexpressionSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpressionSequence = null;


        try {
            // InternalAle.g:2540:59: (iv_ruleexpressionSequence= ruleexpressionSequence EOF )
            // InternalAle.g:2541:2: iv_ruleexpressionSequence= ruleexpressionSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionSequence=ruleexpressionSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionSequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressionSequence"


    // $ANTLR start "ruleexpressionSequence"
    // InternalAle.g:2547:1: ruleexpressionSequence returns [EObject current=null] : ( ( (lv_seqExprs_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) ) )* )? ;
    public final EObject ruleexpressionSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_seqExprs_0_0 = null;

        EObject lv_seqExprs_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2553:2: ( ( ( (lv_seqExprs_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) ) )* )? )
            // InternalAle.g:2554:2: ( ( (lv_seqExprs_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) ) )* )?
            {
            // InternalAle.g:2554:2: ( ( (lv_seqExprs_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_IDENT && LA35_0<=RULE_INT)||(LA35_0>=RULE_STRING && LA35_0<=RULE_REAL)||LA35_0==25||LA35_0==29||LA35_0==38||(LA35_0>=46 && LA35_0<=47)||LA35_0==50||(LA35_0>=72 && LA35_0<=76)||(LA35_0>=78 && LA35_0<=83)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAle.g:2555:3: ( (lv_seqExprs_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) ) )*
                    {
                    // InternalAle.g:2555:3: ( (lv_seqExprs_0_0= ruleexpression ) )
                    // InternalAle.g:2556:4: (lv_seqExprs_0_0= ruleexpression )
                    {
                    // InternalAle.g:2556:4: (lv_seqExprs_0_0= ruleexpression )
                    // InternalAle.g:2557:5: lv_seqExprs_0_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionSequenceAccess().getSeqExprsExpressionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_seqExprs_0_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionSequenceRule());
                      					}
                      					add(
                      						current,
                      						"seqExprs",
                      						lv_seqExprs_0_0,
                      						"org.eclipse.ecoretools.Ale.expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalAle.g:2574:3: (otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==24) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalAle.g:2575:4: otherlv_1= ',' ( (lv_seqExprs_2_0= ruleexpression ) )
                    	    {
                    	    otherlv_1=(Token)match(input,24,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_1, grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_0());
                    	      			
                    	    }
                    	    // InternalAle.g:2579:4: ( (lv_seqExprs_2_0= ruleexpression ) )
                    	    // InternalAle.g:2580:5: (lv_seqExprs_2_0= ruleexpression )
                    	    {
                    	    // InternalAle.g:2580:5: (lv_seqExprs_2_0= ruleexpression )
                    	    // InternalAle.g:2581:6: lv_seqExprs_2_0= ruleexpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getExpressionSequenceAccess().getSeqExprsExpressionParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_seqExprs_2_0=ruleexpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getExpressionSequenceRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"seqExprs",
                    	      							lv_seqExprs_2_0,
                    	      							"org.eclipse.ecoretools.Ale.expression");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressionSequence"


    // $ANTLR start "entryRulevariableDefinition"
    // InternalAle.g:2603:1: entryRulevariableDefinition returns [String current=null] : iv_rulevariableDefinition= rulevariableDefinition EOF ;
    public final String entryRulevariableDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariableDefinition = null;


        try {
            // InternalAle.g:2603:58: (iv_rulevariableDefinition= rulevariableDefinition EOF )
            // InternalAle.g:2604:2: iv_rulevariableDefinition= rulevariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariableDefinition=rulevariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariableDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableDefinition"


    // $ANTLR start "rulevariableDefinition"
    // InternalAle.g:2610:1: rulevariableDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulevariableDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_typeLiteral_2 = null;



        	enterRule();

        try {
            // InternalAle.g:2616:2: ( (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' ) )
            // InternalAle.g:2617:2: (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' )
            {
            // InternalAle.g:2617:2: (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' )
            // InternalAle.g:2618:3: this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|'
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getVariableDefinitionAccess().getIdentTerminalRuleCall_0());
              		
            }
            // InternalAle.g:2625:3: (kw= ':' this_typeLiteral_2= ruletypeLiteral )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAle.g:2626:4: kw= ':' this_typeLiteral_2= ruletypeLiteral
                    {
                    kw=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVariableDefinitionAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeLiteralParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_42);
                    this_typeLiteral_2=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVariableDefinitionAccess().getVerticalLineKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableDefinition"


    // $ANTLR start "entryRuleliteral"
    // InternalAle.g:2651:1: entryRuleliteral returns [EObject current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final EObject entryRuleliteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleliteral = null;


        try {
            // InternalAle.g:2651:48: (iv_ruleliteral= ruleliteral EOF )
            // InternalAle.g:2652:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleliteral=ruleliteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // InternalAle.g:2658:1: ruleliteral returns [EObject current=null] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | otherlv_3= 'true' | otherlv_4= 'false' | otherlv_5= 'null' | (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' ) | (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' ) | (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' ) | ruletypeLiteral ) ;
    public final EObject ruleliteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_Real_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_Ident_12=null;
        Token otherlv_13=null;
        Token this_Ident_14=null;
        Token otherlv_15=null;
        Token this_Ident_16=null;
        Token this_Ident_17=null;
        Token otherlv_18=null;
        Token this_Ident_19=null;
        Token otherlv_20=null;
        EObject this_expressionSequence_7 = null;

        EObject this_expressionSequence_10 = null;



        	enterRule();

        try {
            // InternalAle.g:2664:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | otherlv_3= 'true' | otherlv_4= 'false' | otherlv_5= 'null' | (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' ) | (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' ) | (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' ) | ruletypeLiteral ) )
            // InternalAle.g:2665:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | otherlv_3= 'true' | otherlv_4= 'false' | otherlv_5= 'null' | (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' ) | (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' ) | (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' ) | ruletypeLiteral )
            {
            // InternalAle.g:2665:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | otherlv_3= 'true' | otherlv_4= 'false' | otherlv_5= 'null' | (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' ) | (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' ) | (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' ) | ruletypeLiteral )
            int alt37=11;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalAle.g:2666:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:2671:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:2676:3: this_Real_2= RULE_REAL
                    {
                    this_Real_2=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_Real_2, grammarAccess.getLiteralAccess().getRealTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:2681:3: otherlv_3= 'true'
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_3, grammarAccess.getLiteralAccess().getTrueKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:2686:3: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_4, grammarAccess.getLiteralAccess().getFalseKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAle.g:2691:3: otherlv_5= 'null'
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getNullKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAle.g:2696:3: (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' )
                    {
                    // InternalAle.g:2696:3: (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' )
                    // InternalAle.g:2697:4: otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getLiteralAccess().getSequenceKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_44);
                    this_expressionSequence_7=ruleexpressionSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expressionSequence_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:2718:3: (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' )
                    {
                    // InternalAle.g:2718:3: (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' )
                    // InternalAle.g:2719:4: otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,76,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getLiteralAccess().getOrderedSetKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_44);
                    this_expressionSequence_10=ruleexpressionSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expressionSequence_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_11=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:2740:3: (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT )
                    {
                    // InternalAle.g:2740:3: (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT )
                    // InternalAle.g:2741:4: this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT
                    {
                    this_Ident_12=(Token)match(input,RULE_IDENT,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_12, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_0());
                      			
                    }
                    otherlv_13=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getLiteralAccess().getColonColonKeyword_8_1());
                      			
                    }
                    this_Ident_14=(Token)match(input,RULE_IDENT,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_14, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_2());
                      			
                    }
                    otherlv_15=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getLiteralAccess().getColonColonKeyword_8_3());
                      			
                    }
                    this_Ident_16=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_16, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_4());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAle.g:2763:3: (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' )
                    {
                    // InternalAle.g:2763:3: (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' )
                    // InternalAle.g:2764:4: this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':'
                    {
                    this_Ident_17=(Token)match(input,RULE_IDENT,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_17, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_0());
                      			
                    }
                    otherlv_18=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getLiteralAccess().getColonColonKeyword_9_1());
                      			
                    }
                    this_Ident_19=(Token)match(input,RULE_IDENT,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_19, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_2());
                      			
                    }
                    otherlv_20=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getLiteralAccess().getColonKeyword_9_3());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:2782:3: ruletypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getTypeLiteralParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleliteral"


    // $ANTLR start "entryRuletypeLiteral"
    // InternalAle.g:2796:1: entryRuletypeLiteral returns [String current=null] : iv_ruletypeLiteral= ruletypeLiteral EOF ;
    public final String entryRuletypeLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeLiteral = null;


        try {
            // InternalAle.g:2796:51: (iv_ruletypeLiteral= ruletypeLiteral EOF )
            // InternalAle.g:2797:2: iv_ruletypeLiteral= ruletypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeLiteral=ruletypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeLiteral"


    // $ANTLR start "ruletypeLiteral"
    // InternalAle.g:2803:1: ruletypeLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruletypeLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeLiteral_5 = null;

        AntlrDatatypeRuleToken this_typeLiteral_8 = null;

        AntlrDatatypeRuleToken this_classifierTypeRule_10 = null;

        AntlrDatatypeRuleToken this_classifierTypeRule_12 = null;

        AntlrDatatypeRuleToken this_classifierTypeRule_14 = null;



        	enterRule();

        try {
            // InternalAle.g:2809:2: ( (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) ) )
            // InternalAle.g:2810:2: (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) )
            {
            // InternalAle.g:2810:2: (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt39=1;
                }
                break;
            case 79:
                {
                alt39=2;
                }
                break;
            case 80:
                {
                alt39=3;
                }
                break;
            case 81:
                {
                alt39=4;
                }
                break;
            case 82:
                {
                alt39=5;
                }
                break;
            case 83:
                {
                alt39=6;
                }
                break;
            case RULE_IDENT:
                {
                alt39=7;
                }
                break;
            case 25:
                {
                alt39=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAle.g:2811:3: kw= 'String'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getStringKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:2817:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:2823:3: kw= 'Real'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:2829:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getBooleanKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:2835:3: (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' )
                    {
                    // InternalAle.g:2835:3: (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' )
                    // InternalAle.g:2836:4: kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')'
                    {
                    kw=(Token)match(input,82,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getSequenceKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_typeLiteral_5=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2858:3: (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' )
                    {
                    // InternalAle.g:2858:3: (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' )
                    // InternalAle.g:2859:4: kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')'
                    {
                    kw=(Token)match(input,83,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getOrderedSetKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_typeLiteral_8=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:2881:3: this_classifierTypeRule_10= ruleclassifierTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_classifierTypeRule_10=ruleclassifierTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_classifierTypeRule_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAle.g:2892:3: (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' )
                    {
                    // InternalAle.g:2892:3: (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' )
                    // InternalAle.g:2893:4: kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}'
                    {
                    kw=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_classifierTypeRule_12=ruleclassifierTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_classifierTypeRule_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAle.g:2908:4: (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==71) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalAle.g:2909:5: kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getVerticalLineKeyword_7_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_47);
                    	    this_classifierTypeRule_14=ruleclassifierTypeRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_classifierTypeRule_14);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRightCurlyBracketKeyword_7_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeLiteral"


    // $ANTLR start "entryRuleclassifierTypeRule"
    // InternalAle.g:2935:1: entryRuleclassifierTypeRule returns [String current=null] : iv_ruleclassifierTypeRule= ruleclassifierTypeRule EOF ;
    public final String entryRuleclassifierTypeRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclassifierTypeRule = null;


        try {
            // InternalAle.g:2935:58: (iv_ruleclassifierTypeRule= ruleclassifierTypeRule EOF )
            // InternalAle.g:2936:2: iv_ruleclassifierTypeRule= ruleclassifierTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleclassifierTypeRule=ruleclassifierTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclassifierTypeRule.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclassifierTypeRule"


    // $ANTLR start "ruleclassifierTypeRule"
    // InternalAle.g:2942:1: ruleclassifierTypeRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) ) ;
    public final AntlrDatatypeRuleToken ruleclassifierTypeRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        Token this_Ident_2=null;
        Token this_Ident_3=null;


        	enterRule();

        try {
            // InternalAle.g:2948:2: ( ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) ) )
            // InternalAle.g:2949:2: ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) )
            {
            // InternalAle.g:2949:2: ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IDENT) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==77) ) {
                    alt40=1;
                }
                else if ( (LA40_1==51) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAle.g:2950:3: (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT )
                    {
                    // InternalAle.g:2950:3: (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT )
                    // InternalAle.g:2951:4: this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT
                    {
                    this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_0, grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClassifierTypeRuleAccess().getColonColonKeyword_0_1());
                      			
                    }
                    this_Ident_2=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_2, grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2972:3: (this_Ident_3= RULE_IDENT kw= ':' )
                    {
                    // InternalAle.g:2972:3: (this_Ident_3= RULE_IDENT kw= ':' )
                    // InternalAle.g:2973:4: this_Ident_3= RULE_IDENT kw= ':'
                    {
                    this_Ident_3=(Token)match(input,RULE_IDENT,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_3, grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClassifierTypeRuleAccess().getColonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclassifierTypeRule"


    // $ANTLR start "entryRulerType"
    // InternalAle.g:2990:1: entryRulerType returns [String current=null] : iv_rulerType= rulerType EOF ;
    public final String entryRulerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerType = null;


        try {
            // InternalAle.g:2990:45: (iv_rulerType= rulerType EOF )
            // InternalAle.g:2991:2: iv_rulerType= rulerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerType=rulerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerType"


    // $ANTLR start "rulerType"
    // InternalAle.g:2997:1: rulerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_rQualified_0= rulerQualified | this_typeLiteral_1= ruletypeLiteral ) ;
    public final AntlrDatatypeRuleToken rulerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_rQualified_0 = null;

        AntlrDatatypeRuleToken this_typeLiteral_1 = null;



        	enterRule();

        try {
            // InternalAle.g:3003:2: ( (this_rQualified_0= rulerQualified | this_typeLiteral_1= ruletypeLiteral ) )
            // InternalAle.g:3004:2: (this_rQualified_0= rulerQualified | this_typeLiteral_1= ruletypeLiteral )
            {
            // InternalAle.g:3004:2: (this_rQualified_0= rulerQualified | this_typeLiteral_1= ruletypeLiteral )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_IDENT) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||LA41_1==RULE_IDENT||LA41_1==20) ) {
                    alt41=1;
                }
                else if ( (LA41_1==51||LA41_1==77) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==25||(LA41_0>=78 && LA41_0<=83)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAle.g:3005:3: this_rQualified_0= rulerQualified
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRTypeAccess().getRQualifiedParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rQualified_0=rulerQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rQualified_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:3016:3: this_typeLiteral_1= ruletypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRTypeAccess().getTypeLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeLiteral_1=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeLiteral_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerType"


    // $ANTLR start "entryRulerQualified"
    // InternalAle.g:3030:1: entryRulerQualified returns [String current=null] : iv_rulerQualified= rulerQualified EOF ;
    public final String entryRulerQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerQualified = null;


        try {
            // InternalAle.g:3030:50: (iv_rulerQualified= rulerQualified EOF )
            // InternalAle.g:3031:2: iv_rulerQualified= rulerQualified EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerQualified=rulerQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerQualified.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerQualified"


    // $ANTLR start "rulerQualified"
    // InternalAle.g:3037:1: rulerQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken rulerQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        Token this_Ident_2=null;


        	enterRule();

        try {
            // InternalAle.g:3043:2: ( (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT )* ) )
            // InternalAle.g:3044:2: (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT )* )
            {
            // InternalAle.g:3044:2: (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT )* )
            // InternalAle.g:3045:3: this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT )*
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getRQualifiedAccess().getIdentTerminalRuleCall_0());
              		
            }
            // InternalAle.g:3052:3: (kw= '.' this_Ident_2= RULE_IDENT )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAle.g:3053:4: kw= '.' this_Ident_2= RULE_IDENT
            	    {
            	    kw=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getRQualifiedAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_Ident_2=(Token)match(input,RULE_IDENT,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Ident_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Ident_2, grammarAccess.getRQualifiedAccess().getIdentTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerQualified"

    // $ANTLR start synpred17_InternalAle
    public final void synpred17_InternalAle_fragment() throws RecognitionException {   
        EObject lv_stmt_1_0 = null;


        // InternalAle.g:920:3: ( ( () ( (lv_stmt_1_0= rulerVarDecl ) ) ) )
        // InternalAle.g:920:3: ( () ( (lv_stmt_1_0= rulerVarDecl ) ) )
        {
        // InternalAle.g:920:3: ( () ( (lv_stmt_1_0= rulerVarDecl ) ) )
        // InternalAle.g:921:4: () ( (lv_stmt_1_0= rulerVarDecl ) )
        {
        // InternalAle.g:921:4: ()
        // InternalAle.g:922:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAle.g:931:4: ( (lv_stmt_1_0= rulerVarDecl ) )
        // InternalAle.g:932:5: (lv_stmt_1_0= rulerVarDecl )
        {
        // InternalAle.g:932:5: (lv_stmt_1_0= rulerVarDecl )
        // InternalAle.g:933:6: lv_stmt_1_0= rulerVarDecl
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRStatementAccess().getStmtRVarDeclParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_stmt_1_0=rulerVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalAle

    // $ANTLR start synpred18_InternalAle
    public final void synpred18_InternalAle_fragment() throws RecognitionException {   
        EObject lv_stmt_3_0 = null;


        // InternalAle.g:952:3: ( ( () ( (lv_stmt_3_0= rulerAssign ) ) ) )
        // InternalAle.g:952:3: ( () ( (lv_stmt_3_0= rulerAssign ) ) )
        {
        // InternalAle.g:952:3: ( () ( (lv_stmt_3_0= rulerAssign ) ) )
        // InternalAle.g:953:4: () ( (lv_stmt_3_0= rulerAssign ) )
        {
        // InternalAle.g:953:4: ()
        // InternalAle.g:954:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAle.g:963:4: ( (lv_stmt_3_0= rulerAssign ) )
        // InternalAle.g:964:5: (lv_stmt_3_0= rulerAssign )
        {
        // InternalAle.g:964:5: (lv_stmt_3_0= rulerAssign )
        // InternalAle.g:965:6: lv_stmt_3_0= rulerAssign
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRStatementAccess().getStmtRAssignParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_stmt_3_0=rulerAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalAle

    // $ANTLR start synpred21_InternalAle
    public final void synpred21_InternalAle_fragment() throws RecognitionException {   
        EObject lv_if_9_0 = null;


        // InternalAle.g:1048:3: ( ( () ( (lv_if_9_0= rulerIf ) ) ) )
        // InternalAle.g:1048:3: ( () ( (lv_if_9_0= rulerIf ) ) )
        {
        // InternalAle.g:1048:3: ( () ( (lv_if_9_0= rulerIf ) ) )
        // InternalAle.g:1049:4: () ( (lv_if_9_0= rulerIf ) )
        {
        // InternalAle.g:1049:4: ()
        // InternalAle.g:1050:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAle.g:1059:4: ( (lv_if_9_0= rulerIf ) )
        // InternalAle.g:1060:5: (lv_if_9_0= rulerIf )
        {
        // InternalAle.g:1060:5: (lv_if_9_0= rulerIf )
        // InternalAle.g:1061:6: lv_if_9_0= rulerIf
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRStatementAccess().getIfRIfParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_if_9_0=rulerIf();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalAle

    // $ANTLR start synpred27_InternalAle
    public final void synpred27_InternalAle_fragment() throws RecognitionException {   
        EObject lv_recpart_1_0 = null;


        // InternalAle.g:1647:4: ( (lv_recpart_1_0= rulerecExpression ) )
        // InternalAle.g:1647:4: (lv_recpart_1_0= rulerecExpression )
        {
        // InternalAle.g:1647:4: (lv_recpart_1_0= rulerecExpression )
        // InternalAle.g:1648:5: lv_recpart_1_0= rulerecExpression
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressionAccess().getRecpartRecExpressionParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_recpart_1_0=rulerecExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalAle

    // $ANTLR start synpred35_InternalAle
    public final void synpred35_InternalAle_fragment() throws RecognitionException {   
        EObject lv_recExp_15_0 = null;


        // InternalAle.g:1836:4: ( (lv_recExp_15_0= rulerecExpression ) )
        // InternalAle.g:1836:4: (lv_recExp_15_0= rulerecExpression )
        {
        // InternalAle.g:1836:4: (lv_recExp_15_0= rulerecExpression )
        // InternalAle.g:1837:5: lv_recExp_15_0= rulerecExpression
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getRecExpressionAccess().getRecExpRecExpressionParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_recExp_15_0=rulerecExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalAle

    // Delegated rules

    public final boolean synpred17_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\25\0\6\uffff";
    static final String dfa_3s = "\1\123\25\0\6\uffff";
    static final String dfa_4s = "\26\uffff\1\3\1\4\1\1\1\2\1\6\1\5";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\14\1\uffff\1\13\1\15\20\uffff\1\10\3\uffff\1\23\3\uffff\1\26\4\uffff\1\24\1\uffff\1\27\5\uffff\1\11\1\12\2\uffff\1\25\25\uffff\1\16\1\17\1\20\1\21\1\22\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "919:2: ( ( () ( (lv_stmt_1_0= rulerVarDecl ) ) ) | ( () ( (lv_stmt_3_0= rulerAssign ) ) ) | ( () ( (lv_forEach_5_0= rulerForEach ) ) ) | ( () ( (lv_while_7_0= rulerWhile ) ) ) | ( () ( (lv_if_9_0= rulerIf ) ) ) | ( () ( (lv_expr_11_0= rulerExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAle()) ) {s = 24;}

                        else if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_16 = input.LA(1);

                         
                        int index17_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_17 = input.LA(1);

                         
                        int index17_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_18 = input.LA(1);

                         
                        int index17_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_19 = input.LA(1);

                         
                        int index17_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (synpred21_InternalAle()) ) {s = 27;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_21 = input.LA(1);

                         
                        int index17_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAle()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index17_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\22\23\uffff";
    static final String dfa_9s = "\1\6\21\0\2\uffff";
    static final String dfa_10s = "\1\74\21\0\2\uffff";
    static final String dfa_11s = "\22\uffff\1\2\1\1";
    static final String dfa_12s = "\1\uffff\1\15\1\2\1\7\1\0\1\5\1\1\1\3\1\17\1\20\1\13\1\16\1\6\1\14\1\10\1\11\1\12\1\4\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\11\uffff\1\22\3\uffff\1\1\3\uffff\1\22\1\uffff\1\22\3\uffff\1\22\1\uffff\1\22\1\uffff\1\22\4\uffff\1\22\1\uffff\1\16\1\17\1\20\1\21\1\2\1\uffff\1\5\2\22\2\uffff\1\12\1\4\1\6\1\7\1\10\1\11\1\13\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1646:3: ( (lv_recpart_1_0= rulerecExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_17 = input.LA(1);

                         
                        int index23_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1835:3: ( (lv_recExp_15_0= rulerecExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_17 = input.LA(1);

                         
                        int index25_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_12 = input.LA(1);

                         
                        int index25_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_14 = input.LA(1);

                         
                        int index25_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_15 = input.LA(1);

                         
                        int index25_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_16 = input.LA(1);

                         
                        int index25_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_10 = input.LA(1);

                         
                        int index25_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_13 = input.LA(1);

                         
                        int index25_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA25_11 = input.LA(1);

                         
                        int index25_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_11);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA25_9 = input.LA(1);

                         
                        int index25_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalAle()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index25_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\14\uffff\1\12\2\uffff";
    static final String dfa_16s = "\1\4\10\uffff\1\63\1\uffff\1\4\1\6\2\uffff";
    static final String dfa_17s = "\1\123\10\uffff\1\115\1\uffff\1\4\1\115\2\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\2\uffff\1\12\1\11";
    static final String dfa_19s = "\17\uffff}>";
    static final String[] dfa_20s = {
            "\1\11\1\2\1\uffff\1\1\1\3\20\uffff\1\12\56\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\6\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\31\uffff\1\13",
            "",
            "\1\14",
            "\1\12\11\uffff\1\12\3\uffff\1\12\3\uffff\1\12\1\uffff\1\12\3\uffff\1\12\1\uffff\1\12\1\uffff\1\12\4\uffff\1\12\1\uffff\5\12\1\uffff\3\12\1\uffff\1\15\11\12\20\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2665:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | otherlv_3= 'true' | otherlv_4= 'false' | otherlv_5= 'null' | (otherlv_6= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence otherlv_8= '}' ) | (otherlv_9= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence otherlv_11= '}' ) | (this_Ident_12= RULE_IDENT otherlv_13= '::' this_Ident_14= RULE_IDENT otherlv_15= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT otherlv_18= '::' this_Ident_19= RULE_IDENT otherlv_20= ':' ) | ruletypeLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000006A0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000009E000010L,0x00000000000FC000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000009C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000098000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000010L,0x00000000000FC000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000042000010L,0x00000000000FC000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004C040220001B0L,0x00000000000FDF00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004C048220001B0L,0x00000000000FDF00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004C142260001B0L,0x00000000000FDF00L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1FF0BE0000100042L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xE000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004C040620001B0L,0x00000000000FDF00L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004C040260001B0L,0x00000000000FDF00L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000100002L});

}