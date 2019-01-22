package org.xtext.example.mydsl2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.MMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'file'", "'evaluation'", "'algorithm'", "'varCible'", "'varPredictives'", "'{'", "'languageAlgo'", "'nameAlgo'", "'}'", "'CrossValidation'", "'numRepetitionCross'", "'TrainingTest'", "'pourcentageTraining'", "'SVM'", "'kernelSVM'", "'typeSVM'", "'Tree'", "'methodTree'", "'Python'", "'R'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'class'", "'anova'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMML.g"; }



     	private MMLGrammarAccess grammarAccess;

        public InternalMMLParser(TokenStream input, MMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Traitement";
       	}

       	@Override
       	protected MMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTraitement"
    // InternalMML.g:65:1: entryRuleTraitement returns [EObject current=null] : iv_ruleTraitement= ruleTraitement EOF ;
    public final EObject entryRuleTraitement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitement = null;


        try {
            // InternalMML.g:65:51: (iv_ruleTraitement= ruleTraitement EOF )
            // InternalMML.g:66:2: iv_ruleTraitement= ruleTraitement EOF
            {
             newCompositeNode(grammarAccess.getTraitementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraitement=ruleTraitement();

            state._fsp--;

             current =iv_ruleTraitement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTraitement"


    // $ANTLR start "ruleTraitement"
    // InternalMML.g:72:1: ruleTraitement returns [EObject current=null] : (otherlv_0= 'file' ( (lv_chemin_1_0= RULE_STRING ) ) otherlv_2= 'evaluation' ( (lv_eval_3_0= ruleStratEval ) ) otherlv_4= 'algorithm' ( (lv_algo_5_0= ruleAlgorithm ) ) (otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) ) )? (otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )* )? ) ;
    public final EObject ruleTraitement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_chemin_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_eval_3_0 = null;

        EObject lv_algo_5_0 = null;

        EObject lv_name_7_0 = null;

        EObject lv_names_9_0 = null;



        	enterRule();

        try {
            // InternalMML.g:78:2: ( (otherlv_0= 'file' ( (lv_chemin_1_0= RULE_STRING ) ) otherlv_2= 'evaluation' ( (lv_eval_3_0= ruleStratEval ) ) otherlv_4= 'algorithm' ( (lv_algo_5_0= ruleAlgorithm ) ) (otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) ) )? (otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )* )? ) )
            // InternalMML.g:79:2: (otherlv_0= 'file' ( (lv_chemin_1_0= RULE_STRING ) ) otherlv_2= 'evaluation' ( (lv_eval_3_0= ruleStratEval ) ) otherlv_4= 'algorithm' ( (lv_algo_5_0= ruleAlgorithm ) ) (otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) ) )? (otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )* )? )
            {
            // InternalMML.g:79:2: (otherlv_0= 'file' ( (lv_chemin_1_0= RULE_STRING ) ) otherlv_2= 'evaluation' ( (lv_eval_3_0= ruleStratEval ) ) otherlv_4= 'algorithm' ( (lv_algo_5_0= ruleAlgorithm ) ) (otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) ) )? (otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )* )? )
            // InternalMML.g:80:3: otherlv_0= 'file' ( (lv_chemin_1_0= RULE_STRING ) ) otherlv_2= 'evaluation' ( (lv_eval_3_0= ruleStratEval ) ) otherlv_4= 'algorithm' ( (lv_algo_5_0= ruleAlgorithm ) ) (otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) ) )? (otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraitementAccess().getFileKeyword_0());
            		
            // InternalMML.g:84:3: ( (lv_chemin_1_0= RULE_STRING ) )
            // InternalMML.g:85:4: (lv_chemin_1_0= RULE_STRING )
            {
            // InternalMML.g:85:4: (lv_chemin_1_0= RULE_STRING )
            // InternalMML.g:86:5: lv_chemin_1_0= RULE_STRING
            {
            lv_chemin_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_chemin_1_0, grammarAccess.getTraitementAccess().getCheminSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraitementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"chemin",
            						lv_chemin_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTraitementAccess().getEvaluationKeyword_2());
            		
            // InternalMML.g:106:3: ( (lv_eval_3_0= ruleStratEval ) )
            // InternalMML.g:107:4: (lv_eval_3_0= ruleStratEval )
            {
            // InternalMML.g:107:4: (lv_eval_3_0= ruleStratEval )
            // InternalMML.g:108:5: lv_eval_3_0= ruleStratEval
            {

            					newCompositeNode(grammarAccess.getTraitementAccess().getEvalStratEvalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_eval_3_0=ruleStratEval();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraitementRule());
            					}
            					set(
            						current,
            						"eval",
            						lv_eval_3_0,
            						"org.xtext.example.mydsl2.MML.StratEval");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTraitementAccess().getAlgorithmKeyword_4());
            		
            // InternalMML.g:129:3: ( (lv_algo_5_0= ruleAlgorithm ) )
            // InternalMML.g:130:4: (lv_algo_5_0= ruleAlgorithm )
            {
            // InternalMML.g:130:4: (lv_algo_5_0= ruleAlgorithm )
            // InternalMML.g:131:5: lv_algo_5_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getTraitementAccess().getAlgoAlgorithmParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_algo_5_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraitementRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_5_0,
            						"org.xtext.example.mydsl2.MML.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMML.g:148:3: (otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMML.g:149:4: otherlv_6= 'varCible' ( (lv_name_7_0= ruleVariable ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getTraitementAccess().getVarCibleKeyword_6_0());
                    			
                    // InternalMML.g:153:4: ( (lv_name_7_0= ruleVariable ) )
                    // InternalMML.g:154:5: (lv_name_7_0= ruleVariable )
                    {
                    // InternalMML.g:154:5: (lv_name_7_0= ruleVariable )
                    // InternalMML.g:155:6: lv_name_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getTraitementAccess().getNameVariableParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_7_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraitementRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.xtext.example.mydsl2.MML.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMML.g:173:3: (otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMML.g:174:4: otherlv_8= 'varPredictives' ( (lv_names_9_0= ruleVariable ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getTraitementAccess().getVarPredictivesKeyword_7_0());
                    			
                    // InternalMML.g:178:4: ( (lv_names_9_0= ruleVariable ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMML.g:179:5: (lv_names_9_0= ruleVariable )
                    	    {
                    	    // InternalMML.g:179:5: (lv_names_9_0= ruleVariable )
                    	    // InternalMML.g:180:6: lv_names_9_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getTraitementAccess().getNamesVariableParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_names_9_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTraitementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"names",
                    	    							lv_names_9_0,
                    	    							"org.xtext.example.mydsl2.MML.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraitement"


    // $ANTLR start "entryRuleVariable"
    // InternalMML.g:202:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMML.g:202:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMML.g:203:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMML.g:209:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_INT ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMML.g:215:2: ( ( (lv_name_0_0= RULE_INT ) ) )
            // InternalMML.g:216:2: ( (lv_name_0_0= RULE_INT ) )
            {
            // InternalMML.g:216:2: ( (lv_name_0_0= RULE_INT ) )
            // InternalMML.g:217:3: (lv_name_0_0= RULE_INT )
            {
            // InternalMML.g:217:3: (lv_name_0_0= RULE_INT )
            // InternalMML.g:218:4: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalMML.g:237:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalMML.g:237:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalMML.g:238:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalMML.g:244:1: ruleAlgorithm returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'languageAlgo' ( (lv_lang_2_0= ruleLang ) ) otherlv_3= 'nameAlgo' ( ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_lang_2_0 = null;

        EObject lv_name_4_1 = null;

        EObject lv_name_4_2 = null;



        	enterRule();

        try {
            // InternalMML.g:250:2: ( (otherlv_0= '{' otherlv_1= 'languageAlgo' ( (lv_lang_2_0= ruleLang ) ) otherlv_3= 'nameAlgo' ( ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) ) ) otherlv_5= '}' ) )
            // InternalMML.g:251:2: (otherlv_0= '{' otherlv_1= 'languageAlgo' ( (lv_lang_2_0= ruleLang ) ) otherlv_3= 'nameAlgo' ( ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) ) ) otherlv_5= '}' )
            {
            // InternalMML.g:251:2: (otherlv_0= '{' otherlv_1= 'languageAlgo' ( (lv_lang_2_0= ruleLang ) ) otherlv_3= 'nameAlgo' ( ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) ) ) otherlv_5= '}' )
            // InternalMML.g:252:3: otherlv_0= '{' otherlv_1= 'languageAlgo' ( (lv_lang_2_0= ruleLang ) ) otherlv_3= 'nameAlgo' ( ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getLanguageAlgoKeyword_1());
            		
            // InternalMML.g:260:3: ( (lv_lang_2_0= ruleLang ) )
            // InternalMML.g:261:4: (lv_lang_2_0= ruleLang )
            {
            // InternalMML.g:261:4: (lv_lang_2_0= ruleLang )
            // InternalMML.g:262:5: lv_lang_2_0= ruleLang
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getLangLangEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_lang_2_0=ruleLang();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"lang",
            						lv_lang_2_0,
            						"org.xtext.example.mydsl2.MML.Lang");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmAccess().getNameAlgoKeyword_3());
            		
            // InternalMML.g:283:3: ( ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) ) )
            // InternalMML.g:284:4: ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) )
            {
            // InternalMML.g:284:4: ( (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree ) )
            // InternalMML.g:285:5: (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree )
            {
            // InternalMML.g:285:5: (lv_name_4_1= ruleSVM | lv_name_4_2= ruleTree )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMML.g:286:6: lv_name_4_1= ruleSVM
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmAccess().getNameSVMParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_4_1=ruleSVM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_1,
                    							"org.xtext.example.mydsl2.MML.SVM");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMML.g:302:6: lv_name_4_2= ruleTree
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmAccess().getNameTreeParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_4_2=ruleTree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_2,
                    							"org.xtext.example.mydsl2.MML.Tree");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAlgorithmAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleStratEval"
    // InternalMML.g:328:1: entryRuleStratEval returns [EObject current=null] : iv_ruleStratEval= ruleStratEval EOF ;
    public final EObject entryRuleStratEval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStratEval = null;


        try {
            // InternalMML.g:328:50: (iv_ruleStratEval= ruleStratEval EOF )
            // InternalMML.g:329:2: iv_ruleStratEval= ruleStratEval EOF
            {
             newCompositeNode(grammarAccess.getStratEvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStratEval=ruleStratEval();

            state._fsp--;

             current =iv_ruleStratEval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStratEval"


    // $ANTLR start "ruleStratEval"
    // InternalMML.g:335:1: ruleStratEval returns [EObject current=null] : ( ( (lv_name_0_0= ruleCrossValidation ) ) | this_TrainingTest_1= ruleTrainingTest ) ;
    public final EObject ruleStratEval() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject this_TrainingTest_1 = null;



        	enterRule();

        try {
            // InternalMML.g:341:2: ( ( ( (lv_name_0_0= ruleCrossValidation ) ) | this_TrainingTest_1= ruleTrainingTest ) )
            // InternalMML.g:342:2: ( ( (lv_name_0_0= ruleCrossValidation ) ) | this_TrainingTest_1= ruleTrainingTest )
            {
            // InternalMML.g:342:2: ( ( (lv_name_0_0= ruleCrossValidation ) ) | this_TrainingTest_1= ruleTrainingTest )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMML.g:343:3: ( (lv_name_0_0= ruleCrossValidation ) )
                    {
                    // InternalMML.g:343:3: ( (lv_name_0_0= ruleCrossValidation ) )
                    // InternalMML.g:344:4: (lv_name_0_0= ruleCrossValidation )
                    {
                    // InternalMML.g:344:4: (lv_name_0_0= ruleCrossValidation )
                    // InternalMML.g:345:5: lv_name_0_0= ruleCrossValidation
                    {

                    					newCompositeNode(grammarAccess.getStratEvalAccess().getNameCrossValidationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_0=ruleCrossValidation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStratEvalRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.xtext.example.mydsl2.MML.CrossValidation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMML.g:363:3: this_TrainingTest_1= ruleTrainingTest
                    {

                    			newCompositeNode(grammarAccess.getStratEvalAccess().getTrainingTestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrainingTest_1=ruleTrainingTest();

                    state._fsp--;


                    			current = this_TrainingTest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStratEval"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMML.g:375:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMML.g:375:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMML.g:376:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMML.g:382:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMML.g:388:2: ( (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalMML.g:389:2: (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalMML.g:389:2: (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalMML.g:390:3: otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2());
            		
            // InternalMML.g:402:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalMML.g:403:4: (lv_number_3_0= RULE_INT )
            {
            // InternalMML.g:403:4: (lv_number_3_0= RULE_INT )
            // InternalMML.g:404:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_number_3_0, grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMML.g:428:1: entryRuleTrainingTest returns [EObject current=null] : iv_ruleTrainingTest= ruleTrainingTest EOF ;
    public final EObject entryRuleTrainingTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingTest = null;


        try {
            // InternalMML.g:428:53: (iv_ruleTrainingTest= ruleTrainingTest EOF )
            // InternalMML.g:429:2: iv_ruleTrainingTest= ruleTrainingTest EOF
            {
             newCompositeNode(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingTest=ruleTrainingTest();

            state._fsp--;

             current =iv_ruleTrainingTest; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMML.g:435:1: ruleTrainingTest returns [EObject current=null] : (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleTrainingTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMML.g:441:2: ( (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalMML.g:442:2: (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalMML.g:442:2: (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalMML.g:443:3: otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2());
            		
            // InternalMML.g:455:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalMML.g:456:4: (lv_number_3_0= RULE_INT )
            {
            // InternalMML.g:456:4: (lv_number_3_0= RULE_INT )
            // InternalMML.g:457:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_number_3_0, grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "entryRuleSVM"
    // InternalMML.g:481:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalMML.g:481:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalMML.g:482:2: iv_ruleSVM= ruleSVM EOF
            {
             newCompositeNode(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVM=ruleSVM();

            state._fsp--;

             current =iv_ruleSVM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalMML.g:488:1: ruleSVM returns [EObject current=null] : (otherlv_0= 'SVM' otherlv_1= '{' otherlv_2= 'kernelSVM' ( (lv_type_3_0= ruleSVMKernel ) ) (otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSVM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalMML.g:494:2: ( (otherlv_0= 'SVM' otherlv_1= '{' otherlv_2= 'kernelSVM' ( (lv_type_3_0= ruleSVMKernel ) ) (otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) ) )? otherlv_6= '}' ) )
            // InternalMML.g:495:2: (otherlv_0= 'SVM' otherlv_1= '{' otherlv_2= 'kernelSVM' ( (lv_type_3_0= ruleSVMKernel ) ) (otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) ) )? otherlv_6= '}' )
            {
            // InternalMML.g:495:2: (otherlv_0= 'SVM' otherlv_1= '{' otherlv_2= 'kernelSVM' ( (lv_type_3_0= ruleSVMKernel ) ) (otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) ) )? otherlv_6= '}' )
            // InternalMML.g:496:3: otherlv_0= 'SVM' otherlv_1= '{' otherlv_2= 'kernelSVM' ( (lv_type_3_0= ruleSVMKernel ) ) (otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSVMAccess().getSVMKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSVMAccess().getKernelSVMKeyword_2());
            		
            // InternalMML.g:508:3: ( (lv_type_3_0= ruleSVMKernel ) )
            // InternalMML.g:509:4: (lv_type_3_0= ruleSVMKernel )
            {
            // InternalMML.g:509:4: (lv_type_3_0= ruleSVMKernel )
            // InternalMML.g:510:5: lv_type_3_0= ruleSVMKernel
            {

            					newCompositeNode(grammarAccess.getSVMAccess().getTypeSVMKernelEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_3_0=ruleSVMKernel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSVMRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl2.MML.SVMKernel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMML.g:527:3: (otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMML.g:528:4: otherlv_4= 'typeSVM' ( (lv_name_5_0= ruleSVMType ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getSVMAccess().getTypeSVMKeyword_4_0());
                    			
                    // InternalMML.g:532:4: ( (lv_name_5_0= ruleSVMType ) )
                    // InternalMML.g:533:5: (lv_name_5_0= ruleSVMType )
                    {
                    // InternalMML.g:533:5: (lv_name_5_0= ruleSVMType )
                    // InternalMML.g:534:6: lv_name_5_0= ruleSVMType
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getNameSVMTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_5_0=ruleSVMType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.example.mydsl2.MML.SVMType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSVMAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleTree"
    // InternalMML.g:560:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalMML.g:560:45: (iv_ruleTree= ruleTree EOF )
            // InternalMML.g:561:2: iv_ruleTree= ruleTree EOF
            {
             newCompositeNode(grammarAccess.getTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTree=ruleTree();

            state._fsp--;

             current =iv_ruleTree; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTree"


    // $ANTLR start "ruleTree"
    // InternalMML.g:567:1: ruleTree returns [EObject current=null] : (otherlv_0= 'Tree' otherlv_1= '{' otherlv_2= 'methodTree' ( (lv_type_3_0= ruleTreetype ) ) otherlv_4= '}' ) ;
    public final EObject ruleTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMML.g:573:2: ( (otherlv_0= 'Tree' otherlv_1= '{' otherlv_2= 'methodTree' ( (lv_type_3_0= ruleTreetype ) ) otherlv_4= '}' ) )
            // InternalMML.g:574:2: (otherlv_0= 'Tree' otherlv_1= '{' otherlv_2= 'methodTree' ( (lv_type_3_0= ruleTreetype ) ) otherlv_4= '}' )
            {
            // InternalMML.g:574:2: (otherlv_0= 'Tree' otherlv_1= '{' otherlv_2= 'methodTree' ( (lv_type_3_0= ruleTreetype ) ) otherlv_4= '}' )
            // InternalMML.g:575:3: otherlv_0= 'Tree' otherlv_1= '{' otherlv_2= 'methodTree' ( (lv_type_3_0= ruleTreetype ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTreeAccess().getTreeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTreeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getTreeAccess().getMethodTreeKeyword_2());
            		
            // InternalMML.g:587:3: ( (lv_type_3_0= ruleTreetype ) )
            // InternalMML.g:588:4: (lv_type_3_0= ruleTreetype )
            {
            // InternalMML.g:588:4: (lv_type_3_0= ruleTreetype )
            // InternalMML.g:589:5: lv_type_3_0= ruleTreetype
            {

            					newCompositeNode(grammarAccess.getTreeAccess().getTypeTreetypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleTreetype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTreeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl2.MML.Treetype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTreeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTree"


    // $ANTLR start "ruleLang"
    // InternalMML.g:614:1: ruleLang returns [Enumerator current=null] : ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'R' ) ) ;
    public final Enumerator ruleLang() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMML.g:620:2: ( ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'R' ) ) )
            // InternalMML.g:621:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'R' ) )
            {
            // InternalMML.g:621:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'R' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMML.g:622:3: (enumLiteral_0= 'Python' )
                    {
                    // InternalMML.g:622:3: (enumLiteral_0= 'Python' )
                    // InternalMML.g:623:4: enumLiteral_0= 'Python'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getLangAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLangAccess().getPythonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMML.g:630:3: (enumLiteral_1= 'R' )
                    {
                    // InternalMML.g:630:3: (enumLiteral_1= 'R' )
                    // InternalMML.g:631:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLangAccess().getREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLangAccess().getREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMML.g:641:1: ruleSVMKernel returns [Enumerator current=null] : ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) ;
    public final Enumerator ruleSVMKernel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMML.g:647:2: ( ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) )
            // InternalMML.g:648:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            {
            // InternalMML.g:648:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMML.g:649:3: (enumLiteral_0= 'linear' )
                    {
                    // InternalMML.g:649:3: (enumLiteral_0= 'linear' )
                    // InternalMML.g:650:4: enumLiteral_0= 'linear'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMML.g:657:3: (enumLiteral_1= 'polynomial' )
                    {
                    // InternalMML.g:657:3: (enumLiteral_1= 'polynomial' )
                    // InternalMML.g:658:4: enumLiteral_1= 'polynomial'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMML.g:665:3: (enumLiteral_2= 'radial' )
                    {
                    // InternalMML.g:665:3: (enumLiteral_2= 'radial' )
                    // InternalMML.g:666:4: enumLiteral_2= 'radial'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleSVMType"
    // InternalMML.g:676:1: ruleSVMType returns [Enumerator current=null] : ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) ;
    public final Enumerator ruleSVMType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMML.g:682:2: ( ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) )
            // InternalMML.g:683:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            {
            // InternalMML.g:683:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMML.g:684:3: (enumLiteral_0= 'C-classification' )
                    {
                    // InternalMML.g:684:3: (enumLiteral_0= 'C-classification' )
                    // InternalMML.g:685:4: enumLiteral_0= 'C-classification'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSVMTypeAccess().getCClassEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMTypeAccess().getCClassEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMML.g:692:3: (enumLiteral_1= 'nu-classification' )
                    {
                    // InternalMML.g:692:3: (enumLiteral_1= 'nu-classification' )
                    // InternalMML.g:693:4: enumLiteral_1= 'nu-classification'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSVMTypeAccess().getNuClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMTypeAccess().getNuClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMML.g:700:3: (enumLiteral_2= 'one-classification' )
                    {
                    // InternalMML.g:700:3: (enumLiteral_2= 'one-classification' )
                    // InternalMML.g:701:4: enumLiteral_2= 'one-classification'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSVMTypeAccess().getOneClassEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMTypeAccess().getOneClassEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMType"


    // $ANTLR start "ruleTreetype"
    // InternalMML.g:711:1: ruleTreetype returns [Enumerator current=null] : ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'anova' ) ) ;
    public final Enumerator ruleTreetype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMML.g:717:2: ( ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'anova' ) ) )
            // InternalMML.g:718:2: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'anova' ) )
            {
            // InternalMML.g:718:2: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'anova' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMML.g:719:3: (enumLiteral_0= 'class' )
                    {
                    // InternalMML.g:719:3: (enumLiteral_0= 'class' )
                    // InternalMML.g:720:4: enumLiteral_0= 'class'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTreetypeAccess().getClassEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTreetypeAccess().getClassEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMML.g:727:3: (enumLiteral_1= 'anova' )
                    {
                    // InternalMML.g:727:3: (enumLiteral_1= 'anova' )
                    // InternalMML.g:728:4: enumLiteral_1= 'anova'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTreetypeAccess().getAnovaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTreetypeAccess().getAnovaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTreetype"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000000L});

}